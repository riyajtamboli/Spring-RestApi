package com.rt.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromeNumber {
	
	public String checkPalindrome(int n) {
		int num = 0;
		int temp = n;
		
		while(temp > 0) {
			int ld = temp % 10;
			num = (num * 10)+ld;
			temp /= 10;
		}
		
		if(num == n) {
			return n + " Number is Palindrome";
		}else {
			return n + " Number is not Palindrome";
		}
	}
}
