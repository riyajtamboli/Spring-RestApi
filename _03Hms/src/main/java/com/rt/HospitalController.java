package com.rt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	
	@GetMapping("/")
	public String home() {
		return "Welcome to City Hospital";
	}
	
	@GetMapping("/doctor")
	public String doctor() {
		return "Doctor Available: Dr. Sharma";
	}
	
	@GetMapping("/emergency")
	public String emergency() {
		return "Emergency Services Available 24/7";
	}

}
