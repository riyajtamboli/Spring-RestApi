package com.rt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MesageController {
	
	@Value("${message}")
	private String msg;
	
	@GetMapping("/msg")
	public String getMessage() {
		return msg;
	}
	

}
