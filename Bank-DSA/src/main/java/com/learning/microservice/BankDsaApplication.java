package com.learning.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BankDsaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankDsaApplication.class, args);
	}

}
