package com.rt.service;

import org.springframework.stereotype.Service;

@Service
public class AppService {
	
	public String prime(int n) {
		
		for(int i=2; i<n; i++) {
			if(n % i!= 0) {
				return n +" Number is Prime Number";
			}
		}
			return n+ " Number is not Prime Number";
			
		}
	
	
}
