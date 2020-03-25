package com.flight.DTO;

import com.flight.entity.FlightType;

public class FlightDto {
	
	private String airlineName;
	private String flightCode;
	private FlightType flight;
	
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getFlightCode() {
		return flightCode;
	}
	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}
	public FlightType getFlight() {
		return flight;
	}
	public void setFlight(FlightType flight) {
		this.flight = flight;
	}
	
	
	
	

}
