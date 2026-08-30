package com.rt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student-controller")
public class StuudentController {
	
	@GetMapping("/student")
	public String student() {
		return "Hello from Student Service";
	}
	
	
}
