package com.microservice.deptmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeptmicroserviceApplication.class, args);
	}

}
