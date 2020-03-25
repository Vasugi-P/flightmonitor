package com.flight.web;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

import com.flight.DTO.AddFlightDto;
import com.flight.DTO.FlightDto;
import com.flight.entity.FlightType;
import com.flight.exception.FlightNotFoundException;
import com.flight.exception.FlightScheduleNotFoundException;
import com.flight.service.FlightService;

@RunWith(MockitoJUnitRunner.class)
public class FlighthControllerTest {
	
	@Mock
	FlightService flightService;
	
	@InjectMocks
	FlightController flightController;
	
	AddFlightDto add=null;
	FlightDto flight=null;
	
	@Test
	public void testAddFlightSchedule()throws FlightScheduleNotFoundException{
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
		
		String expected="Flight schedule added successfully";
		Mockito.when(flightService.addFlightSchedule(add)).thenReturn(expected);
		ResponseEntity<String> response=flightController.addFlightSchedule(add);
		assertEquals(expected, response.getBody());
		
	}
	
	@Test
	public void testAddFlight()throws FlightNotFoundException{
		flight=new FlightDto();
		flight.setAirlineName("AirIndia");
		flight.setFlight(FlightType.domestic);
		flight.setFlightCode("A09");
		
		String expected="flight added successfully";
		Mockito.when(flightService.addFlight(flight)).thenReturn(expected);
		ResponseEntity<String> response=flightController.addFlight(flight);
		assertEquals(expected, response.getBody());
		
	}

}
