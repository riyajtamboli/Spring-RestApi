package com.rt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rt.service.IPalindromeNumber;

@RestController
public class NumberController {

	@Autowired
	private IPalindromeNumber palindromeNumber;
	
	@GetMapping("/number/{number}")
	public ResponseEntity<String> check(@PathVariable("number") Integer number){
		return new ResponseEntity<String>(palindromeNumber.checkPalindrome(number), HttpStatus.OK);
	}
	
}
