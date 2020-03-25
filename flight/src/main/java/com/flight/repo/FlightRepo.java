package com.flight.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.entity.Flight;






@Repository
public interface FlightRepo extends JpaRepository<Flight, Long>{
	
	public Optional<Flight> findByFlightCode(String flightCode);
	
	public Optional<List<Flight>> findAllByFlightType(String flightType);
	
	public Optional<List<Flight>> findAllByAirlineName(String airlineName);
	
	public Optional<List<Flight>> findAllByAirlineId(String airlineId);

}
