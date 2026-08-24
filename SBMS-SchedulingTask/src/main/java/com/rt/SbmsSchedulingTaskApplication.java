package com.rt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SbmsSchedulingTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbmsSchedulingTaskApplication.class, args);
		System.out.println("Main Method");
	}

}
