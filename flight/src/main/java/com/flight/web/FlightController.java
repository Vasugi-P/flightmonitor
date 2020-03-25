package com.flight.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flight.DTO.AddFlightDto;
import com.flight.DTO.FlightDto;
import com.flight.DTO.Response;
import com.flight.exception.FlightNotFoundException;
import com.flight.exception.FlightScheduleNotFoundException;
import com.flight.service.FlightService;

@RestController
public class FlightController {
	
	@Autowired
	private FlightService fs;
	
	
	@PostMapping(value="flight-monitor/flights/schedules")
	public ResponseEntity<String>addFlightSchedule(@RequestBody AddFlightDto addFlight)throws FlightScheduleNotFoundException{
		String message=fs.addFlightSchedule(addFlight);
		
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
	
	@PostMapping(value="flight-monitor/flights")
	public ResponseEntity<String>addFlight(@RequestBody FlightDto flightDto)throws FlightNotFoundException{
		String message=fs.addFlight(flightDto);
		return new ResponseEntity<String>(message,HttpStatus.OK);
	}
	

}
