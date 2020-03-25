package com.flight.service;

import com.flight.DTO.AddFlightDto;
import com.flight.DTO.FlightDto;
import com.flight.exception.FlightNotFoundException;
import com.flight.exception.FlightScheduleNotFoundException;

public interface FlightService {
	
	public String  addFlightSchedule(AddFlightDto addFlightDto)throws FlightScheduleNotFoundException;
	
	public String addFlight(FlightDto flightDto)throws FlightNotFoundException;
	

}
