package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.springframework.cache.annotation.Cacheable;


@Entity
@Cacheable
@Table(name= "cab_trip_data")
public class CabTripData implements Serializable{
	
	@Id
	private String medallion;
	private String hack_license;
	private String vendor_id;
	private int rate_code;
	private String  store_and_fwd_flag;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date pickup_datetime;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date  dropoff_datetime ;
	private int  passenger_count;
	private int  trip_time_in_secs;
	private double  trip_distance;
	private double  pickup_longitude;
	private double  pickup_latitude;
	private double  dropoff_longitude;
	private double  dropoff_latitude;
	
	
	public String getMedallion() {
		return medallion;
	}
	public void setMedallion(String medallion) {
		this.medallion = medallion;
	}
	public String getHack_license() {
		return hack_license;
	}
	public void setHack_license(String hack_license) {
		this.hack_license = hack_license;
	}
	public String getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(String vendor_id) {
		this.vendor_id = vendor_id;
	}
	public int getRate_code() {
		return rate_code;
	}
	public void setRate_code(int rate_code) {
		this.rate_code = rate_code;
	}
	public String getStore_and_fwd_flag() {
		return store_and_fwd_flag;
	}
	public void setStore_and_fwd_flag(String store_and_fwd_flag) {
		this.store_and_fwd_flag = store_and_fwd_flag;
	}
	public Date getPickup_datetime() {
		return pickup_datetime;
	}
	public void setPickup_datetime(Date pickup_datetime) {
		this.pickup_datetime = pickup_datetime;
	}
	public Date getDropoff_datetime() {
		return dropoff_datetime;
	}
	public void setDropoff_datetime(Date dropoff_datetime) {
		this.dropoff_datetime = dropoff_datetime;
	}
	public int getPassenger_count() {
		return passenger_count;
	}
	public void setPassenger_count(int passenger_count) {
		this.passenger_count = passenger_count;
	}
	public int getTrip_time_in_secs() {
		return trip_time_in_secs;
	}
	public void setTrip_time_in_secs(int trip_time_in_secs) {
		this.trip_time_in_secs = trip_time_in_secs;
	}
	public double getTrip_distance() {
		return trip_distance;
	}
	public void setTrip_distance(double trip_distance) {
		this.trip_distance = trip_distance;
	}
	public double getPickup_longitude() {
		return pickup_longitude;
	}
	public void setPickup_longitude(double pickup_longitude) {
		this.pickup_longitude = pickup_longitude;
	}
	public double getPickup_latitude() {
		return pickup_latitude;
	}
	public void setPickup_latitude(double pickup_latitude) {
		this.pickup_latitude = pickup_latitude;
	}
	public double getDropoff_longitude() {
		return dropoff_longitude;
	}
	public void setDropoff_longitude(double dropoff_longitude) {
		this.dropoff_longitude = dropoff_longitude;
	}
	public double getDropoff_latitude() {
		return dropoff_latitude;
	}
	public void setDropoff_latitude(double dropoff_latitude) {
		this.dropoff_latitude = dropoff_latitude;
	}
	
	

}
