package com.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.entity.ParkingSlot;
import com.rt.service.ParkingSlotService;

@RestController
@RequestMapping("parking")
public class ParkingController {
	
	@Autowired
	private ParkingSlotService service;
	
	@PostMapping("/save")
	public ResponseEntity<ParkingSlot> save(@RequestBody ParkingSlot parkingSlot){
		ParkingSlot ps = service.addParkingSlot(parkingSlot);
		return new ResponseEntity<ParkingSlot>(ps,HttpStatus.OK);
	}
	
	@GetMapping("/view")
	public ResponseEntity<List<ParkingSlot>> getParkingAll(){
		List<ParkingSlot> parkingSlots = service.getAllParkingSlot();
		return new ResponseEntity<List<ParkingSlot>>(parkingSlots, HttpStatus.OK);
	}
	
	@GetMapping("/view/{id}")
	public ResponseEntity<ParkingSlot> getById(@PathVariable Long id){
		ParkingSlot parkingSlotById = service.getParkingSlotById(id);
		return new ResponseEntity<ParkingSlot>(parkingSlotById, HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ParkingSlot> update(@PathVariable Long id, @RequestBody ParkingSlot slot){
		ParkingSlot updateParking = service.updateParking(id, slot);
		return new ResponseEntity<ParkingSlot>(updateParking, HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id){
		String deleteParking = service.deleteParking(id);
		return new ResponseEntity<String>(deleteParking, HttpStatus.OK);
	}
	
}
