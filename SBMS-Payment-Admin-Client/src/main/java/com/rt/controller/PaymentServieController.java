package com.rt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentServieController {
	
	@GetMapping("/payment")
	public String payment() {
		return "Payment Service Called";
	}
}
