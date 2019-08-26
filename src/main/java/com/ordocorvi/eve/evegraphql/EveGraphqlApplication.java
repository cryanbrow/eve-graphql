package com.ordocorvi.eve.evegraphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.ordocorvi.*")
@EnableCaching
@EnableAsync
@EnableScheduling
public class EveGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(EveGraphqlApplication.class, args);
	}
	
}
