package com.ordocorvi.eve.evegraphql.query;

import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.ordocorvi.eve.evegraphql.dao.CrestDao;
import com.ordocorvi.eve.evegraphql.dto.Order;
import com.ordocorvi.eve.evegraphql.dto.Station;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private CrestDao crestDao;
	
	public List<Order> ordersForRegion(int id, Ordertype ordertype, long type_id) {
		return crestDao.ordersForRegion(id, ordertype, type_id);
	}
	
	public com.ordocorvi.eve.evegraphql.dto.System systemById(long id) throws InterruptedException, ExecutionException {
		return crestDao.getSystemById(id).get();
	}
	
	public Station stationById(long id) throws InterruptedException, ExecutionException {
		return crestDao.getStationById(id).get();
	}
	
}
