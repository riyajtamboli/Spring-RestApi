package com.rt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@GetMapping("/")
	public String employee() {
		return "Employee Management System";
	}
	
	@GetMapping("/details")
	public String details() {
		return "Employee Name: Amit, Department: IT";
	}
	
}
