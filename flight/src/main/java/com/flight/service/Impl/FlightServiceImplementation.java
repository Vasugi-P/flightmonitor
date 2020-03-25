package com.flight.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight.DTO.AddFlightDto;
import com.flight.DTO.FlightDto;
import com.flight.entity.Flight;
import com.flight.entity.FlightSchedule;
import com.flight.exception.FlightNotFoundException;
import com.flight.exception.FlightScheduleNotFoundException;
import com.flight.repo.FlightRepo;
import com.flight.repo.FlightScheduleRepo;
import com.flight.service.FlightService;


@Service
public class FlightServiceImplementation implements FlightService{

	@Autowired
	private FlightScheduleRepo repo;
	
	@Autowired
	private FlightRepo repo1;
	
	@Override
	public String addFlightSchedule(AddFlightDto addFlightDto) throws FlightScheduleNotFoundException{
		FlightSchedule schedule= new FlightSchedule(addFlightDto.getFlightId(),addFlightDto.getFlightDate(),addFlightDto.getDepartureTime(),
				addFlightDto.getSource(),addFlightDto.getTransit(),addFlightDto.getArrival(),addFlightDto.getTransitDepTime(),addFlightDto.getDestination(),
				addFlightDto.getDstArrivalTime(),addFlightDto.getTravelTime());
		repo.save(schedule);
		return "Flight schedule added successfully";
		
	}

	@Override
	public String addFlight(FlightDto flightDto) throws FlightNotFoundException{
		Flight flight=new Flight(flightDto.getAirlineName(),flightDto.getFlight(),flightDto.getFlightCode());
		repo1.save(flight);
		return "flight added successfully";		
	}

}
