package com.rt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SbmsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmsEurekaServerApplication.class, args);
	}

}
