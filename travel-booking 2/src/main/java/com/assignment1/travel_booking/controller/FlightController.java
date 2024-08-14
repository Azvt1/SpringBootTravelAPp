package com.assignment1.travel_booking.controller;


import com.assignment1.travel_booking.model.Flight;
import com.assignment1.travel_booking.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flights")
public class FlightController {
    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @PostMapping
    public ResponseEntity<Flight> createFlight(@RequestBody Flight flight) {
        Flight savedFlight = flightService.saveFlight(flight);
        return ResponseEntity.ok(savedFlight);
    }

    @GetMapping("/{flightNumber}")
    public ResponseEntity<Flight> getFlightById(@PathVariable Long flightNumber) {
        Optional<Flight> foundFlight = flightService.getFlightById(flightNumber);
        return foundFlight.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getFlights();
    }

    @DeleteMapping("/{flightNumber}")
    public ResponseEntity<Void> deleteFlight(@PathVariable Long flightNumber) {
        flightService.deleteFlight(flightNumber);
        return ResponseEntity.noContent().build();
    }

}
