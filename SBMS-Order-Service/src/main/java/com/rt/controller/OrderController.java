package com.rt.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class OrderController {
	
	@GetMapping("/order")
	public String getMethodName() {
		return new String("Order Service is running");
	}
	

}
