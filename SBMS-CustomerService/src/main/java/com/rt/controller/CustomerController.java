package com.rt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
	
	@GetMapping("/customer")
	public String getMethodName() {
		return new String("Customer Service is running");
	}
	

}
