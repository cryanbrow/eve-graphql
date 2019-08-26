package com.ordocorvi.eve.evegraphql.resolvers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.ordocorvi.eve.evegraphql.dao.CrestDao;
import com.ordocorvi.eve.evegraphql.dto.Constellation;

@Component
public class SystemResolver implements GraphQLResolver<com.ordocorvi.eve.evegraphql.dto.System>{
	@Autowired
	private CrestDao crestDao;
	
	public Constellation getConstellation(com.ordocorvi.eve.evegraphql.dto.System system) {
		return crestDao.getConstellationById(system.getConstellationId());
	}
	
}
