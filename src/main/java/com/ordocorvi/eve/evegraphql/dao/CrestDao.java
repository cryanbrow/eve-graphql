package com.ordocorvi.eve.evegraphql.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.ordocorvi.eve.evegraphql.dto.Order;

@Component
public class CrestDao {
	private RestTemplate restTemplate = new RestTemplate();

	public List<Order> ordersForRegion(int id) {
		// TODO remove this hardcoded crap. Also String concat
		ResponseEntity<Order[]> entity = restTemplate.exchange("https://esi.evetech.net/latest/markets/" + id + "/orders/?datasource=tranquility&order_type=all&page=1", HttpMethod.GET, null, Order[].class);
		
		List<String> pages = entity.getHeaders().get("x-pages");
		int int_pages = Integer.valueOf(pages.get(0));
		System.out.println(int_pages);
		
		ArrayList<Order> orders = new ArrayList<>();
		orders.addAll(new ArrayList<>(Arrays.asList(entity.getBody())));
		for (int i = 2 ; i <= int_pages ; i++) {
			ResponseEntity<Order[]> tempEntity = restTemplate.exchange("https://esi.evetech.net/latest/markets/" + id + "/orders/?datasource=tranquility&order_type=all&page=" + i, HttpMethod.GET, null, Order[].class);
			orders.addAll(new ArrayList<>(Arrays.asList(tempEntity.getBody())));
		}
		
		return orders;
	}

}
