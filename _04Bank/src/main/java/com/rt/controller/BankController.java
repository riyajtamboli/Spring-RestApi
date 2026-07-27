package com.rt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankController {
	
	@GetMapping("/")
	public String bank() {
		return "Welcome to Abc Bank";
	}
	
	
	@GetMapping("/balance")
	public String balance() {
		return "Your Balance is ₹50,000";
	}
	
	@GetMapping("/loan")
	public String loan() {
		return "Personal Loan Service Available";
	}
}
