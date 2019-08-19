package com.ordocorvi.eve.evegraphql.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.ordocorvi.eve.evegraphql.dao.CrestDao;
import com.ordocorvi.eve.evegraphql.dto.Order;

@Component
public class OrderResolver implements GraphQLResolver<Order> {
	@Autowired
	private CrestDao crestDao;
	
	public com.ordocorvi.eve.evegraphql.dto.System getSystem(Order order) {
		return crestDao.getSystemById(order.getSystem_id());
	}
	
}
