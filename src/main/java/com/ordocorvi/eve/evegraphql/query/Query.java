package com.ordocorvi.eve.evegraphql.query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.ordocorvi.eve.evegraphql.dao.CrestDao;
import com.ordocorvi.eve.evegraphql.dto.Order;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private CrestDao crestDao;
	
	public List<Order> ordersForRegion(int id) {
		return crestDao.ordersForRegion(id);
	}
	
}
