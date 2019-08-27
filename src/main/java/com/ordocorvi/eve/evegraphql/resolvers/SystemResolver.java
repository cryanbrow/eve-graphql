package com.ordocorvi.eve.evegraphql.resolvers;

import java.util.ArrayList;
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
import com.ordocorvi.eve.evegraphql.dto.Station;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class SystemResolver implements GraphQLResolver<com.ordocorvi.eve.evegraphql.dto.System> {
	@Autowired
	private CrestDao crestDao;

	public CompletableFuture<Constellation> getConstellation(com.ordocorvi.eve.evegraphql.dto.System system) {
		return crestDao.getConstellationById(system.getConstellationId());
	}

	public CompletableFuture<Star> getStar(com.ordocorvi.eve.evegraphql.dto.System system) {
		return crestDao.getStarById(system.getStarId());
	}

	public List<Stargate> getStargateList(com.ordocorvi.eve.evegraphql.dto.System system) {
		List<Stargate> stargates = new ArrayList<Stargate>();
		for (Long stargateId : system.getStargateIds()) {
			stargates.add(crestDao.getStargateById(stargateId));
		}
		return stargates;
	}
	
	public List<Station> getStationList(com.ordocorvi.eve.evegraphql.dto.System system) throws InterruptedException, ExecutionException {
		List<Station> stations = new ArrayList<Station>();
		if (system.getStationIds() != null) {
			List<CompletableFuture<Station>> futures = new ArrayList<>();
			for (Long stationId : system.getStationIds()) {
				CompletableFuture<Station> aFutureToBelieveIn = crestDao.getStationById(stationId);
				futures.add(aFutureToBelieveIn);
			}
			for (CompletableFuture<Station> station : futures) {
				stations.add(station.get());
			}
		}
		return stations;
		
	}

}
