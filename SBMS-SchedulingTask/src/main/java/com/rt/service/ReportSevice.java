package com.rt.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ReportSevice {
	
	public ReportSevice() {
		System.out.println("Report Service 0 param contructor");
	}
	
	@Scheduled(fixedDelay = 3000)
	public void showReport() {
		System.out.println("Sales Report:: showReport() : "+new Date());
	}
}
