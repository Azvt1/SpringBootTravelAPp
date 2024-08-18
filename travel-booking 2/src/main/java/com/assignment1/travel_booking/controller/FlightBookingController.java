package com.assignment1.travel_booking.controller;


import com.assignment1.travel_booking.dto.FlightBookingDTO;
import com.assignment1.travel_booking.model.Booking;
import com.assignment1.travel_booking.model.Flight;
import com.assignment1.travel_booking.model.FlightBooking;
import com.assignment1.travel_booking.repository.BookingRepository;
import com.assignment1.travel_booking.repository.FlightRepository;
import com.assignment1.travel_booking.service.FlightBookingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/flightBooking")
public class FlightBookingController {
    private final FlightBookingService flightBookingService;
    private final FlightRepository flightRepository;

    private final BookingRepository bookingRepository;



    public FlightBookingController(FlightBookingService flightBookingService, FlightRepository flightRepository, BookingRepository bookingRepository) {
        this.flightBookingService = flightBookingService;
        this.flightRepository = flightRepository;
        this.bookingRepository = bookingRepository;
    }

    @GetMapping
    public List<FlightBookingDTO> getAllFlightBookings() {
        return flightBookingService.getAllFlightBookings();
    }

    @GetMapping("/{flightBookingId}")
    public ResponseEntity<FlightBooking> getFlightById(@PathVariable Long flightBookingId) {
        Optional<FlightBooking> foundFlightBooking = flightBookingService.getFlightBookingById(flightBookingId);

        return foundFlightBooking
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<FlightBooking> createFlightBooking(@RequestBody FlightBooking flightBooking) {
        // Retrieve the Flight entity from the database using the flight number from the request
        Long flightNumber = flightBooking.getFlight().getFlightNumber();
        Flight flight = flightRepository.findById(flightNumber)
                .orElseThrow(() -> new RuntimeException("Flight not found with flight number: " + flightNumber));

        // Set the retrieved Flight entity in the FlightBooking
        flightBooking.setFlight(flight);

        // Retrieve the booking
        Long bookingId = flightBooking.getBooking().getBookingId();
        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found, double check the id"));

        flightBooking.setBooking(booking);

        // Save the FlightBooking
        FlightBooking savedFlightBooking = flightBookingService.saveFlightBooking(flightBooking);
        return ResponseEntity.ok(savedFlightBooking);
    }


    @DeleteMapping("/{flightBookingId}")
    public ResponseEntity<Void> deleteFlightBooking(@PathVariable Long flightBookingId) {
        flightBookingService.deleteFlightBooking(flightBookingId);
        return ResponseEntity.noContent().build();
    }

}
