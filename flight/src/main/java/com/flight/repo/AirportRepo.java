package com.flight.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flight.entity.Airport;




@Repository
public interface AirportRepo extends JpaRepository<Airport, Long>{

	
	/*public Optional<Airport> findByAirportCode(String airportCode);*/
	
}
