package com.rt.service;

import java.util.List;

import com.rt.entity.SmartLocker;

public interface SmartLockerService {
	
	public SmartLocker addLocker(SmartLocker locker);
	
	public List<SmartLocker> viewAllLocker();
	
	public SmartLocker viewById(Long id);
	
	public SmartLocker updateLocker(Long id);
	
	public SmartLocker partialUpdate(Long id, Double hourlyRate);
	
	public String deleteLocker(Long id);
}
