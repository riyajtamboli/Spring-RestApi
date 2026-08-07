package com.rt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ParkingSlot {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long slotId;
	private String slotCode;
	private Integer floorNumber;
	private String vehicleType;
	private Double hourlyRate;
	private Boolean avilable;
	
}
