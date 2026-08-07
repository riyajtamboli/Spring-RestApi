package com.rt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rt.entity.SmartLocker;
import com.rt.service.SmartLockerService;

@RestController
@RequestMapping("/smart-locker")
public class SmartLockerController {
	
	@Autowired
	private SmartLockerService lockerService;
	
	@PostMapping("/save")
	public ResponseEntity<SmartLocker> addLocker(@RequestBody SmartLocker locker){
		SmartLocker locker2 = lockerService.addLocker(locker);
		return ResponseEntity.ok(locker2);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<SmartLocker>> AllLocker(){
		List<SmartLocker> allLocker = lockerService.viewAllLocker();
		return ResponseEntity.ok(allLocker);
	}
	
	@GetMapping("/byId/{id}")
	public ResponseEntity<SmartLocker> getById(@PathVariable Long id){
		 SmartLocker locker = lockerService.viewById(id);
		return ResponseEntity.ok(locker);	
	}
	
	
	@PutMapping("save/{id}")
	public ResponseEntity<SmartLocker> updateLocker(@PathVariable Long id, String lockerCode){
		SmartLocker locker = lockerService.updateLocker(id);
		locker.setLockerCode("Abc123");
		return ResponseEntity.ok(locker);
	}
	
	@PatchMapping("/update/{id}")
	public ResponseEntity<SmartLocker> partialUpdate(@PathVariable Long id,  Double hourlyRate){
		SmartLocker partialUpdate = lockerService.partialUpdate(id, 20000D);
		return new ResponseEntity<SmartLocker>(partialUpdate, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable Long id){
		String locker = lockerService.deleteLocker(id);
		return new ResponseEntity<String>(locker, HttpStatus.OK);
	}
}

