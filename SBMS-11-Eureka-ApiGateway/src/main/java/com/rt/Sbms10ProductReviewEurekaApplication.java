package com.rt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Sbms10ProductReviewEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sbms10ProductReviewEurekaApplication.class, args);
	}

}
