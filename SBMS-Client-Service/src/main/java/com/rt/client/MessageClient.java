package com.rt.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "SBMS-Message-Service")
public interface MessageClient {

	@GetMapping("/msg")
	public String getMessage();
}
