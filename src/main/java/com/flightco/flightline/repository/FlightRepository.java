package com.flightco.flightline.repository;

import java.util.Optional;

import com.flightco.flightline.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {    
    Optional<Flight> findByFlightCode(String flightCode);
}