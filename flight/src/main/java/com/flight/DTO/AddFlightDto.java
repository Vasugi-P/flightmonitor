package com.flight.DTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class AddFlightDto {
	
	private Long flightId;
	private LocalDate filghtDate;
	private LocalTime  departureTime;
	private String source;
	private String arrival;
	private LocalTime time;
	private String transit;
	private LocalTime transitDepTime;
	private String destination;
	private LocalTime dstArrivalTime;
	private LocalTime travelTime;
	public Long getFlightId() {
		return flightId;
	}
	public void setFlightId(Long flightId) {
		this.flightId = flightId;
	}
	public LocalDate getFilghtDate() {
		return filghtDate;
	}
	public void setFilghtDate(LocalDate filghtDate) {
		this.filghtDate = filghtDate;
	}
	public LocalTime getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(LocalTime departureTime) {
		this.departureTime = departureTime;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	public String getTransit() {
		return transit;
	}
	public void setTransit(String transit) {
		this.transit = transit;
	}
	public LocalTime getTransitDepTime() {
		return transitDepTime;
	}
	public void setTransitDepTime(LocalTime transitDepTime) {
		this.transitDepTime = transitDepTime;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalTime getDstArrivalTime() {
		return dstArrivalTime;
	}
	public void setDstArrivalTime(LocalTime dstArrivalTime) {
		this.dstArrivalTime = dstArrivalTime;
	}
	public LocalTime getTravelTime() {
		return travelTime;
	}
	public void setTravelTime(LocalTime travelTime) {
		this.travelTime = travelTime;
	}
	
	
	

}
