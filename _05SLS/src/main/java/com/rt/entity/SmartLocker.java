package com.rt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class SmartLocker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long lockerId;
	
	private String lockerCode;
	
	private String location;
	private String lockerSize;
	private Boolean isAvailable;
	private Double hourlyRate;
	
	
	
}
