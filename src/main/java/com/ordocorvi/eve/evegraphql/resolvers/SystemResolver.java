package com.ordocorvi.eve.evegraphql.resolvers;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.ordocorvi.eve.evegraphql.dao.CrestDao;
import com.ordocorvi.eve.evegraphql.dto.Constellation;
import com.ordocorvi.eve.evegraphql.dto.Star;
import com.ordocorvi.eve.evegraphql.dto.Stargate;

@Component
public class SystemResolver implements GraphQLResolver<com.ordocorvi.eve.evegraphql.dto.System>{
	@Autowired
	private CrestDao crestDao;
	
	public CompletableFuture<Constellation> getConstellation(com.ordocorvi.eve.evegraphql.dto.System system) {
		return crestDao.getConstellationById(system.getConstellationId());
	}
	
	public CompletableFuture<Star> getStar(com.ordocorvi.eve.evegraphql.dto.System system) {
		return crestDao.getStarById(system.getStarId());
	}
	
	public List<Stargate> getStargateList(com.ordocorvi.eve.evegraphql.dto.System system) throws InterruptedException, ExecutionException {
		return crestDao.getStargateListByIds(system.getStargateIds());
	}
	
}
