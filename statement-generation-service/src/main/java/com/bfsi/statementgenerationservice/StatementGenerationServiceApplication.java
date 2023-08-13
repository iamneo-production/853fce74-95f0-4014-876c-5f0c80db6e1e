package com.bfsi.statementgenerationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StatementGenerationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatementGenerationServiceApplication.class, args);
	}

}
