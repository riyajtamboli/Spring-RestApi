package com.rt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/course-controller")
public class CourseController {
	
	@GetMapping("/course")
	public String course() {
		return "Hello from Course Service";
	}
	
	
}
