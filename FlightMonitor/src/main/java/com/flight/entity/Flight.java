package com.flight.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int flightId;
	private String airlineName;
	private FlightType flight;
	private int flightCode;
	private int airlineId;
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
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
	public int getFlightCode() {
		return flightCode;
	}
	public void setFlightCode(int flightCode) {
		this.flightCode = flightCode;
	}
	public int getAirlineId() {
		return airlineId;
	}
	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}
	public Flight(String airlineName, FlightType flight, int flightCode, int airlineId) {
		super();
		this.airlineName = airlineName;
		this.flight = flight;
		this.flightCode = flightCode;
		this.airlineId = airlineId;
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
