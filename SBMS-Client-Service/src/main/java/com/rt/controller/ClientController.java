package com.rt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.client.MessageClient;


@RestController
public class ClientController {
	
	@Autowired
	MessageClient client;
	
	@GetMapping("/get")
	public String getMethodName() {
		String message = client.getMessage();
		return message;
	}
	

}
