package com.example.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CabTripData;
import com.example.demo.repository.CabTripDataRepository;

@Service
public class CabTripDataService {
	
	@Autowired
	private CabTripDataRepository cabTripDataRepository;

	public Long getAllTrips(){
		return cabTripDataRepository.count();
	}
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	public Integer getCountByMedallionAndPickupDatetime(String medallionId, String pickupDate){
		Integer count = 0;
		try {
			count = cabTripDataRepository.findByMedallionAndPickup_datetime(medallionId, sdf.parse(pickupDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
	
	public List getNumberOfTripsPerMedallion(String medallions){
		List medIds = new ArrayList<String>();
		StringTokenizer str = new StringTokenizer(medallions, ",");
		while(str.hasMoreTokens()){
			medIds.add(str.nextToken());
		}
		return cabTripDataRepository.findByMedallion(medIds);
	}
	
}


