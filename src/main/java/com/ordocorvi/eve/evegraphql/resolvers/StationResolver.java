package com.ordocorvi.eve.evegraphql.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.ordocorvi.eve.evegraphql.dao.CrestDao;
import com.ordocorvi.eve.evegraphql.dto.Corporation;
import com.ordocorvi.eve.evegraphql.dto.Station;

import lombok.ToString;

@ToString
@Component
public class StationResolver implements GraphQLResolver<Station> {

	@Autowired
	private CrestDao crestDao;

	public Corporation getOwner_corporation(Station station) {
		//return crestDao.getCorporationById(station.getOwnerId());
		return null;
	}

}
