package com.rt.controller;


import org.jspecify.annotations.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class CourierConsumerController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	String url = "http://localhost:8080/pruducer/courier/status";
	
	@GetMapping("/status")
	public String chechStatus(){
		
		@Nullable
		String msg = restTemplate.getForObject(url, String.class);
		System.out.println(msg);
		return msg;
	}
}
