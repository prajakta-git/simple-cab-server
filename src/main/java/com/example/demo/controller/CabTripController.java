package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.CabTripDataService;

@RestController
public class CabTripController {

	@Autowired
	private CabTripDataService cabTripDataService;
	
	@RequestMapping("/api/totaltrips/{medallion}/{pickupDate}")
	public Integer getTripCountByMedallionAndDate(@PathVariable String medallion , @PathVariable String pickupDate){
		return cabTripDataService.getCountByMedallionAndPickupDatetime(medallion, pickupDate);
	}
	
	
	@RequestMapping("/api/trippermed/{medallion}")
	public List getTripCountPerMedallion(@PathVariable String medallion){
		return cabTripDataService.getNumberOfTripsPerMedallion(medallion);
	}

}
