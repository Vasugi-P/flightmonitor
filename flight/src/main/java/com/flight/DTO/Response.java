package com.flight.DTO;

public class Response {
 private Long FlightId;
 private String statusCode;
 private String message;
public Long getFlightId() {
	return FlightId;
}
public void setFlightId(Long flightId) {
	FlightId = flightId;
}
public String getStatusCode() {
	return statusCode;
}
public void setStatusCode(String statusCode) {
	this.statusCode = statusCode;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
 
 
 
}
