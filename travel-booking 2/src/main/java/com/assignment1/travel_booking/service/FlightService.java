package com.assignment1.travel_booking.service;

import com.assignment1.travel_booking.model.Flight;
import com.assignment1.travel_booking.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public Flight saveFlight(Flight flight) {
        return flightRepository.save(flight);
    }


    public Optional<Flight> getFlightById(Long flightNumber) {
        return flightRepository.findById(flightNumber);
    }

    public List<Flight> getFlights() {
        return flightRepository.findAll();
    }

    public void deleteFlight(Long flightNumber) {
        flightRepository.deleteById(flightNumber);
    }

}
