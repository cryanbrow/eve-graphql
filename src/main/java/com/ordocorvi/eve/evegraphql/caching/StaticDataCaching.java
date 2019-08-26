package com.ordocorvi.eve.evegraphql.caching;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.ordocorvi.eve.evegraphql.dao.CrestDao;

@Component
public class StaticDataCaching {

	@Autowired
	private CrestDao crestDao;
	
	//@Scheduled(fixedRate = 86400000)
	private void preLoadItemCache() {
		crestDao.getAllItemTypes();
	}
	
}
