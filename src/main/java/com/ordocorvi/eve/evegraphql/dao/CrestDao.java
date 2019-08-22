package com.ordocorvi.eve.evegraphql.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ordocorvi.eve.evegraphql.dto.Constellation;
import com.ordocorvi.eve.evegraphql.dto.ItemType;
import com.ordocorvi.eve.evegraphql.dto.Moon;
import com.ordocorvi.eve.evegraphql.dto.Order;
import com.ordocorvi.eve.evegraphql.dto.Station;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CrestDao {
	private RestTemplate restTemplate = new RestTemplate();

	public List<Order> ordersForRegion(int id) {
		// TODO remove this hardcoded crap. Also String concat
		ResponseEntity<Order[]> entity = restTemplate.exchange("https://esi.evetech.net/latest/markets/" + id
				+ "/orders/?datasource=tranquility&order_type=all&page=1", HttpMethod.GET, null, Order[].class);

		List<String> pages = entity.getHeaders().get("x-pages");
		int int_pages = Integer.valueOf(pages.get(0));
		System.out.println(int_pages);

		ArrayList<Order> orders = new ArrayList<>();
		orders.addAll(new ArrayList<>(Arrays.asList(entity.getBody())));
		// TODO do this with a thread pool or something. Do I make it part of the bean
		// to limit the total number of threads per the application or do I make it
		// method scoped so that each hit can have up to a number of threads.

		for (int i = 2; i <= int_pages; i++) {
			ResponseEntity<Order[]> tempEntity = restTemplate.exchange(
					"https://esi.evetech.net/latest/markets/" + id
							+ "/orders/?datasource=tranquility&order_type=all&page=" + i,
					HttpMethod.GET, null, Order[].class);
			orders.addAll(new ArrayList<>(Arrays.asList(tempEntity.getBody())));
		}

		return orders;
	}

	@Cacheable("system")
	public com.ordocorvi.eve.evegraphql.dto.System getSystemById(long system_id) {
		// TODO remove this hardcoded crap. Also String concat
		ResponseEntity<com.ordocorvi.eve.evegraphql.dto.System> entity = restTemplate.exchange(
				"https://esi.evetech.net/latest/universe/systems/" + system_id + "/", HttpMethod.GET, null,
				com.ordocorvi.eve.evegraphql.dto.System.class);
		log.info("Resolving System: " + entity.getBody().getName());
		return entity.getBody();
	}
	
	@Cacheable("moon")
	public Moon getMoonById(long moon_id) {
		ResponseEntity<Moon> entity = restTemplate.exchange(
				"https://esi.evetech.net/latest/universe/moons/" + moon_id + "/", HttpMethod.GET, null,
				Moon.class);
		log.info("Resolving Moon: " + entity.getBody().getName());
		return entity.getBody();
	}
	
	@Cacheable("item_type")
	public ItemType getItemTypeById(long type_id) {
		ResponseEntity<ItemType> entity = restTemplate.exchange(
				"https://esi.evetech.net/latest/universe/types/" + type_id + "/", HttpMethod.GET, null,
				ItemType.class);
		log.info("Resolving Item Type: " + entity.getBody().getName());
		return entity.getBody();
	}
	
	@Cacheable("constellatioon")
	public Constellation getConstellationById(long constellation_id) {
		ResponseEntity<Constellation> entity = restTemplate.exchange(
				"https://esi.evetech.net/latest/universe/constellations/" + constellation_id + "/", HttpMethod.GET, null,
				Constellation.class);
		log.info("Resolving Item Type: " + entity.getBody().getName());
		return entity.getBody();
	}
	
	@Cacheable("station")
	public Station getStationById(long location_id) {
		//TODO move this somewhere.
		if (location_id < 2147483647) {
		ResponseEntity<Station> entity = restTemplate.exchange(
				"https://esi.evetech.net/latest/universe/stations/" + location_id + "/", HttpMethod.GET, null,
				Station.class);
		log.info("Resolving Station: " + entity.getBody().getName());
		return entity.getBody();
		} else {
			log.info("Location was greater than int32");
			return null;
		}
		
	}

}
