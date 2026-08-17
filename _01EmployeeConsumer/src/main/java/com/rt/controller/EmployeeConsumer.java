package com.rt.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeConsumer {

	@Autowired
	private DiscoveryClient client;
	@GetMapping("/employee")
	public String getEmployee() {
		List<ServiceInstance> list = client.getInstances("_01EmployeeProducer");
		ServiceInstance serviceInstance = list.get(0);
		URI uri = serviceInstance.getUri();
		RestTemplate template =new RestTemplate();
		String resp = template.getForObject(uri, String.class);
		return resp;
	}
}
