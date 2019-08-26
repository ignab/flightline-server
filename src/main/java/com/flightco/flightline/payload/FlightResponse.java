package com.flightco.flightline.payload;

import java.util.Collection;

public class FlightResponse {

    private String flight;
    private Collection<PassengerResponse> passengers;
    
    //should make mapping class
    public static FlightResponse MapFlightData(Collection<PassengerResponse> passengers, String flightCode){
        FlightResponse flightResponse = new FlightResponse();
        flightResponse.setFlight(flightCode);
        flightResponse.setPassengers(passengers);
        return  flightResponse;
    }
    
    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    public Collection<PassengerResponse> getPassengers() {
        return passengers;
    }

    public void setPassengers(Collection<PassengerResponse> passengers) {
        this.passengers = passengers;
    }

    
} 