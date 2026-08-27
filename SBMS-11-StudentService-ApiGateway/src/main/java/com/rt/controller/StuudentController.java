package com.rt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StuudentController {
	
	@GetMapping("/student")
	public String student() {
		return "Hello from Student Service";
	}
	
	
}
