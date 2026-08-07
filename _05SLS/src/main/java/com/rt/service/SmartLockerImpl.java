package com.rt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.entity.SmartLocker;
import com.rt.repository.SmartLockerRepository;

@Service
public class SmartLockerImpl implements SmartLockerService {

	@Autowired
	private SmartLockerRepository lockerRepository;
	
	@Override
	public SmartLocker addLocker(SmartLocker locker) {
		SmartLocker smartLocker = lockerRepository.save(locker);
		return smartLocker;
	}

	@Override
	public List<SmartLocker> viewAllLocker() {
		return lockerRepository.findAll();
	}

	@Override
	public SmartLocker viewById(Long id) {
		// TODO Auto-generated method stub
		Optional<SmartLocker> smartLocker = lockerRepository.findById(id);
		if(smartLocker.isPresent()) {
			return  smartLocker.get();
		}else {
			return null;
		}
	}

	@Override
	public SmartLocker updateLocker(Long id) {
	SmartLocker smartLocker = viewById(id);
	return lockerRepository.save(smartLocker);
	
	}

	@Override
	public SmartLocker partialUpdate(Long id, Double hourlyRate) {
		SmartLocker smartLocker = viewById(id);
		smartLocker.setHourlyRate(hourlyRate);
		return smartLocker;
	}

	@Override
	public String deleteLocker(Long id) {
		lockerRepository.deleteById(id);
		return "Locker deleted whose id : "+id;
	}

}