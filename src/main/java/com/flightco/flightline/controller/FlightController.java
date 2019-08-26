package com.flightco.flightline.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import com.flightco.flightline.model.Passenger;
import com.flightco.flightline.payload.FlightResponse;
import com.flightco.flightline.payload.PassengerResponse;
import com.flightco.flightline.repository.PassengerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightController {

    // @Autowired
    // private FlightRepository flightRepository;

    @Autowired
    private PassengerRepository passengerRepository;

    // @GetMapping("/flights")
    // public Page<Flight> getFlights(Pageable pageable) {
    //     return flightRepository.findAll(pageable);
    // }

    // @PostMapping("/flights/create")
    // public Flight createFlight(@Valid @RequestBody Flight flight) {
    //     return flightRepository.save(flight);
    // }
    
    @GetMapping("/manifest/{flightCode}")
    public FlightResponse getManifest(@PathVariable String flightCode) {
        Collection<Passenger> passengers = passengerRepository
                 .findAllByFlightCode(flightCode);
        Collection<PassengerResponse> passengersResponse = passengers.stream().map(passenger -> {
            PassengerResponse passengerResponse = new PassengerResponse();
            passengerResponse.setName(passenger.getName());
            passengerResponse.setLastname(passenger.getLastname());
            passengerResponse.setSeat(passenger.getSeat());
            return passengerResponse;
        }).collect(Collectors.toList());

        return FlightResponse.MapFlightData(passengersResponse, flightCode);
    }

   
}