package com.flight.entity;


import java.time.LocalDate;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class FlightSchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int scheduleId;
	private LocalDate filghtDate;
	private LocalTime  departureTime;
	private String source;
	private LocalTime transitArrivalTime;
	private String transit;
	private LocalTime transitDepTime;
	private String destination;
	private LocalTime dstArrivalTime;
	private LocalTime travelTime;
	
	@OneToOne
	private Flight flight;

}
