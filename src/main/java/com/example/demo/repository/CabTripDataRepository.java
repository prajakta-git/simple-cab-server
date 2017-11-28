package com.example.demo.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.model.CabTripData;
import java.lang.String;
import java.util.List;

@Repository
public interface CabTripDataRepository extends JpaRepository<CabTripData, String> {

	@Query("select count(*) as NumberOfTrips from CabTripData c where c.medallion = :medallion and cast(c.pickup_datetime as date) = :pickup_date group by c.medallion")	
	Integer findByMedallionAndPickup_datetime(@Param("medallion")String medallion, @Param("pickup_date")Date pickup_date);
	
	@Query("select c.medallion, count(*) as NumberOfTrips from CabTripData c where medallion in (:medIds) group by medallion")
	List findByMedallion(@Param("medIds")List<String> medallion);
}
