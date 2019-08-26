package com.flightco.flightline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

import com.flightco.flightline.model.Passenger;
import com.flightco.flightline.payload.PassengerRequest;
import com.flightco.flightline.repository.PassengerRepository;


@RestController
public class PassengerController {

    @Autowired
    private PassengerRepository passengerRepository;
    
/*
    //Testing Functionality
    // @GetMapping("/flights/{flightId}/passengers")
    // public List<Passenger> getPassengersByFlightId(@PathVariable Long flightId) {
    //     return passengerRepository.findByFlightId(flightId);
    // }    

    // @GetMapping("/manifest/{flightCode}")
    // public List<Passenger> getManifest(@PathVariable String flightCode) {
    //     return passengerRepository.findAllByFlightId(
    //             flightRepository.findByFlightCode(flightCode)
    //                 .map(flight -> {
    //                     return flight.getId();
    //                 }).orElseThrow(() -> new ResourceNotFoundException("Flight Code not found: " + flightCode)));
    // }

    // @GetMapping("/flights/{flightCode}/passengers")
    // public List<Passenger> getPassengersByFlightCode(@PathVariable String flightCode) {
    //     return passengerRepository.findAllByFlightId(
    //             flightRepository.findByFlightCode(flightCode)
    //                 .map(flight -> {
    //                     return flight.getId();
    //                 }).orElseThrow(() -> new ResourceNotFoundException("Flight Code not found: " + flightCode)));
    // }

    // @PostMapping("/flights/{flightCode}/addpassenger")
    // public Passenger addPassanger(@PathVariable String flightCode,
    //                         @Valid @RequestBody Passenger passenger) {
    //     return flightRepository.findByFlightCode(flightCode)
    //             .map(flight -> {
    //                 passenger.setFlight(flight);
    //                 return passengerRepository.save(passenger);
    //             }).orElseThrow(() -> new ResourceNotFoundException("Question not found with id " + flightCode));
    // }
*/
    
    @PostMapping("/manifest/add")
    public Passenger addPassanger(@Valid @RequestBody PassengerRequest passengerRequest) {
        String flightCode = passengerRequest.getFlightCode();
        Passenger passenger = new Passenger();
        passenger.setFlightCode(flightCode);
        passenger.setSeat(passengerRequest.getSeat());
        passenger.setName(passengerRequest.getName());
        passenger.setLastname(passengerRequest.getLastname());
        return passengerRepository.save(passenger);         
    }
}