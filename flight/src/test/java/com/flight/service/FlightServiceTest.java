package com.flight.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.flight.DTO.AddFlightDto;
import com.flight.entity.FlightSchedule;
import com.flight.exception.FlightScheduleNotFoundException;
import com.flight.repo.FlightRepo;
import com.flight.repo.FlightScheduleRepo;

@RunWith(MockitoJUnitRunner.Silent.class)
public class FlightServiceTest {
	
	@Mock
	private FlightRepo flightrepo;
	
	@Mock
	private FlightScheduleRepo flightScRepo;
	
	@InjectMocks
	private FlightService fs;
	
	AddFlightDto add;
	FlightSchedule sch=null;
	
	@Test
	public void testAddFlightSchedule()throws FlightScheduleNotFoundException{
		add=new AddFlightDto();
		add=new AddFlightDto();
		add.setFlightId(1L);
		add.setArrival("Delhi");
		add.setDepartureTime("10:00 PM");
		add.setDestination("Mumbai");
		add.setDstArrivalTime("02:00 AM");
		add.setFilghtDate("10/03/2020");
		add.setFlightId(1L);
		add.setSource("BLR");
		add.setTransit("Direct");
		add.setTransitDepTime("09:00 PM");
		add.setTravelTime("1 HR");
		
		
	}
	
	
	
	
	

}
