package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BookingAndPassengerDetailsMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingAndPassengerDetailsMicroServiceApplication.class, args);
	}

}
