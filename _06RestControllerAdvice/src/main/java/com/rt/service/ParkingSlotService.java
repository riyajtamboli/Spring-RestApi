package com.rt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.entity.ParkingSlot;
import com.rt.globalexception.MyGobleException;
import com.rt.reposity.ParkingSlotRepository;

@Service
public class ParkingSlotService {

	@Autowired
	private ParkingSlotRepository repository;
	@Autowired
	private MyGobleException myGobleException;
	
	public ParkingSlot addParkingSlot(ParkingSlot parkingSlot) {
		return repository.save(parkingSlot);
	}

	public List<ParkingSlot> getAllParkingSlot() {
		return repository.findAll();
	}

	public ParkingSlot getParkingSlotById(Long id) {
		Optional<ParkingSlot> parkingSlot = repository.findById(id);
		if (parkingSlot.isPresent()) {
			return parkingSlot.get();
		} else {
			return null;
		}
	}

	public ParkingSlot updateParking(Long id, ParkingSlot parkingSlot) {
		 ParkingSlot parkingSlots = repository.findById(id).orElseThrow(()-> myGobleException.parkingslotnotfoundexception());
		 ParkingSlot ps = repository.save(parkingSlot);
		return ps;

	}

	public String deleteParking(Long id) {
		
			 ParkingSlot parkingSlot = repository.findById(id).orElseThrow(()-> myGobleException.parkingslotnotfoundexception());
			 repository.delete(parkingSlot);
				return "Parking Slot deleted with id :" + parkingSlot.getSlotId();
			
		
	}
	
	

}
