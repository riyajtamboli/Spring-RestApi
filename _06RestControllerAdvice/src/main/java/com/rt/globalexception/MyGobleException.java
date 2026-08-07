package com.rt.globalexception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.rt.customexception.ParkingSlotNotFoundException;

@RestControllerAdvice
public class MyGobleException {
	
	@ExceptionHandler(ParkingSlotNotFoundException.class)
	public ParkingSlotNotFoundException parkingslotnotfoundexception() {
		return new ParkingSlotNotFoundException("Parking Not Found..");
	}

}
