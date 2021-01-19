package com.flight.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Airport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int airportId;
	private String airportName;
	private String location;
	public int getAirportId() {
		return airportId;
	}
	public void setAirportId(int airportId) {
		this.airportId = airportId;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Airport(String airportName, String location) {
		super();
		this.airportName = airportName;
		this.location = location;
	}
	public Airport() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
