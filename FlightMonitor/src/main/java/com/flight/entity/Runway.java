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
	private int runwayId;
	private LocalTime runwayWaitTime;
	private LocalTime mid_Air_wait_time;
	private String type;

	@ManyToOne
	private Airport airport;
	
	@OneToOne
	private Flight flight;

	public int getRunwayId() {
		return runwayId;
	}

	public void setRunwayId(int runwayId) {
		this.runwayId = runwayId;
	}

	public LocalTime getRunwayWaitTime() {
		return runwayWaitTime;
	}

	public void setRunwayWaitTime(LocalTime runwayWaitTime) {
		this.runwayWaitTime = runwayWaitTime;
	}

	public LocalTime getMid_Air_wait_time() {
		return mid_Air_wait_time;
	}

	public void setMid_Air_wait_time(LocalTime mid_Air_wait_time) {
		this.mid_Air_wait_time = mid_Air_wait_time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Airport getAirport() {
		return airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	
	
	
	
}
