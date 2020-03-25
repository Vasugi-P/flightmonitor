package com.flight.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long flightId;
	private String airlineName;
	private FlightType flight;
	private String flightCode;
	
	
	
	public Long getFlightId() {
		return flightId;
	}


	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}


	


	public String getAirlineName() {
		return airlineName;
	}


	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}


	public FlightType getFlight() {
		return flight;
	}


	public void setFlight(FlightType flight) {
		this.flight = flight;
	}


	public String getFlightCode() {
		return flightCode;
	}


	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}


	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Flight(String airlineName, FlightType flight, String flightCode) {
		super();
		this.airlineName = airlineName;
		this.flight = flight;
		this.flightCode = flightCode;
	}
	
	
	

}
