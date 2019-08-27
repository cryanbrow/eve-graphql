package com.ordocorvi.eve.evegraphql.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ordocorvi.eve.evegraphql.dto.Constellation;
import com.ordocorvi.eve.evegraphql.dto.ItemType;
import com.ordocorvi.eve.evegraphql.dto.Moon;
import com.ordocorvi.eve.evegraphql.dto.Order;
import com.ordocorvi.eve.evegraphql.dto.Star;
import com.ordocorvi.eve.evegraphql.dto.Stargate;
import com.ordocorvi.eve.evegraphql.dto.Station;
import com.ordocorvi.eve.evegraphql.query.Ordertype;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CrestDao {
	private final RestTemplate restTemplate;

	public CrestDao(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

	public List<Order> ordersForRegion(int id, Ordertype ordertype, long type_id) {
		StringBuffer sb = new StringBuffer();
		sb.append("https://esi.evetech.net/latest/markets/");
		sb.append(id);
		sb.append("/orders/?datasource=tranquility&page=1&order_type=");
		sb.append(ordertype);
		sb.append("&region_id=");
		sb.append(id);
		if (type_id != 0) {
			sb.append("&type_id=");
			sb.append(type_id);
		}
		log.info(sb.toString());
		ResponseEntity<Order[]> entity = restTemplate.exchange(sb.toString(), HttpMethod.GET, null, Order[].class);

		List<String> pages = entity.getHeaders().get("x-pages");
		int int_pages = Integer.valueOf(pages.get(0));

		ArrayList<Order> orders = new ArrayList<>();
		orders.addAll(new ArrayList<>(Arrays.asList(entity.getBody())));
		// TODO do this with a thread pool or something. Do I make it part of the bean
		// to limit the total number of threads per the application or do I make it
		// method scoped so that each hit can have up to a number of threads.

		for (int i = 2; i <= int_pages; i++) {
			sb.delete(0, sb.length());
			sb.append("https://esi.evetech.net/latest/markets/");
			sb.append(id);
			sb.append("/orders/?datasource=tranquility&page=");
			sb.append(i);
			sb.append("&order_type=");
			sb.append(ordertype);
			sb.append("&region_id=");
			sb.append(id);
			if (type_id != 0) {
				sb.append("&type_id=");
				sb.append(type_id);
			}
			ResponseEntity<Order[]> tempEntity = restTemplate.exchange(sb.toString(), HttpMethod.GET, null, Order[].class);
			orders.addAll(new ArrayList<>(Arrays.asList(tempEntity.getBody())));
		}

		return orders;
	}
	
	@Async
	@Cacheable("system")
	public CompletableFuture<com.ordocorvi.eve.evegraphql.dto.System> getSystemById(long system_id) {
		// TODO remove this hardcoded crap. Also String concat
		ResponseEntity<com.ordocorvi.eve.evegraphql.dto.System> entity = restTemplate.exchange("https://esi.evetech.net/latest/universe/systems/" + system_id + "/", HttpMethod.GET, null, com.ordocorvi.eve.evegraphql.dto.System.class);
		log.info("Resolving System: " + entity.getBody().getName());
		return CompletableFuture.completedFuture(entity.getBody());
	}
	
	@Async
	@Cacheable("moon")
	public CompletableFuture<Moon> getMoonById(long moon_id) {
		ResponseEntity<Moon> entity = restTemplate.exchange("https://esi.evetech.net/latest/universe/moons/" + moon_id + "/", HttpMethod.GET, null, Moon.class);
		log.info("Resolving Moon: " + entity.getBody().getName());
		return CompletableFuture.completedFuture(entity.getBody());
	}

	public void getAllItemTypes() {
		log.info("Getting All Item Types");
		ResponseEntity<long[]> entity = restTemplate.exchange("https://esi.evetech.net/latest/universe/types/", HttpMethod.GET, null, long[].class);
		List<String> pages = entity.getHeaders().get("x-pages");
		int int_pages = Integer.valueOf(pages.get(0));
		
		for (long typeId : entity.getBody()) {
			CompletableFuture.completedFuture(this.getItemTypeById(typeId));
		}
		
		for (int i = 2; i <= int_pages; i++) {
			ResponseEntity<long[]> innerEntity = restTemplate.exchange("https://esi.evetech.net/latest/universe/types/&page=" + i, HttpMethod.GET, null, long[].class);
			for (long typeId : innerEntity.getBody()) {
				CompletableFuture.completedFuture(this.getItemTypeById(typeId));
			}
		}
		
	}
	
	@Async
	@Cacheable("item_type")
	public CompletableFuture<ItemType> getItemTypeById(long type_id) {
		ResponseEntity<ItemType> entity = restTemplate.exchange("https://esi.evetech.net/latest/universe/types/" + type_id + "/", HttpMethod.GET, null, ItemType.class);
		log.info("Resolving Item Type: " + entity.getBody().getName());
		return CompletableFuture.completedFuture(entity.getBody());
	}

	@Async
	@Cacheable("constellation")
	public CompletableFuture<Constellation> getConstellationById(long constellation_id) {
		ResponseEntity<Constellation> entity = restTemplate.exchange("https://esi.evetech.net/latest/universe/constellations/" + constellation_id + "/", HttpMethod.GET, null, Constellation.class);
		log.info("Resolving Constellation: " + entity.getBody().getName());
		return CompletableFuture.completedFuture(entity.getBody());
	}
	
	@Async("threadPoolTaskExecutor")
	@Cacheable("station")
	public CompletableFuture<Station> getStationById(long location_id) {
		// TODO move this somewhere.
		if (location_id < 2147483647) {
			ResponseEntity<Station> entity = restTemplate.exchange("https://esi.evetech.net/latest/universe/stations/" + location_id + "/", HttpMethod.GET, null, Station.class);
			log.info("Resolving Station: " + entity.getBody().getName());
			return CompletableFuture.completedFuture(entity.getBody());
		} else {
			log.info("Location was greater than int32");
			return CompletableFuture.completedFuture(new Station());
		}

	}
	
	@Async
	@Cacheable("star")
	public CompletableFuture<Star> getStarById(long starId) {
		ResponseEntity<Star> entity = restTemplate.exchange("https://esi.evetech.net/latest/universe/stars/" + starId + "/", HttpMethod.GET, null, Star.class);
		log.info("Resolving Star: " + entity.getBody().getName());
		return CompletableFuture.completedFuture(entity.getBody());
	}

	@Cacheable("stargate")
	public Stargate getStargateById(long stargateId) {
		ResponseEntity<Stargate> entity = restTemplate.exchange("https://esi.evetech.net/latest/universe/stargates/" + stargateId + "/", HttpMethod.GET, null, Stargate.class);
		log.info("Resolving Stargate: " + entity.getBody().getName());
		return entity.getBody();
	}
	
}
