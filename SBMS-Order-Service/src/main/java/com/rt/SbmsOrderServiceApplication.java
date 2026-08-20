package com.rt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SbmsOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmsOrderServiceApplication.class, args);
	}

}
