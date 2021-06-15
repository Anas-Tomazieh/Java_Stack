package com.example.routingfamiliar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RoutingfamiliarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoutingfamiliarApplication.class, args);
		CodingController x = new CodingController();
	}

}
