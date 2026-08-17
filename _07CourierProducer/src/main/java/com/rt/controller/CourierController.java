package com.rt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courier")
public class CourierController {
	
	@GetMapping("/status")
	public ResponseEntity<String> getStatus(){
		return new ResponseEntity<String>("Courier package is rready for delivery", HttpStatus.OK);
	}
}
