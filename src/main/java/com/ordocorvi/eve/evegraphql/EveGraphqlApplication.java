package com.ordocorvi.eve.evegraphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan("com.ordocorvi.*")
public class EveGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(EveGraphqlApplication.class, args);
	}

}
