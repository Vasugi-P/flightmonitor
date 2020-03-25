package com.flight.service;

import com.flight.DTO.AddFlightDto;
import com.flight.DTO.FlightDto;

public interface FlightService {
	
	public String  addFlightSchedule(AddFlightDto addFlightDto);
	public String addFlight(FlightDto flightDto);
	

}
