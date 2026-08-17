package com.rt.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("PrimeService")
public interface INumberService {
	@GetMapping("/number/{number}")
	String check(@PathVariable("number") int n);
}
