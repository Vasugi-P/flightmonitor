package com.flight.entity;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Runway {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long runwayId;
	private Long airportId;
	private Long flightId;
	private String runwayWaitTime;
	private String mid_Air_wait_time;
	private String type;

	

	public Long getRunwayId() {
		return runwayId;
	}

	public void setRunwayId(Long runwayId) {
		this.runwayId = runwayId;
	}

	public String getRunwayWaitTime() {
		return runwayWaitTime;
	}

	public void setRunwayWaitTime(String runwayWaitTime) {
		this.runwayWaitTime = runwayWaitTime;
	}

	public String getMid_Air_wait_time() {
		return mid_Air_wait_time;
	}

	public void setMid_Air_wait_time(String mid_Air_wait_time) {
		this.mid_Air_wait_time = mid_Air_wait_time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getAirportId() {
		return airportId;
	}

	public void setAirportId(Long airportId) {
		this.airportId = airportId;
	}

	public Long getFlightId() {
		return flightId;
	}

	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}


	
	
	
	
	
}
