package com.assignment1.travel_booking.service;

import com.assignment1.travel_booking.model.Flight;
import com.assignment1.travel_booking.model.FlightBooking;
import com.assignment1.travel_booking.repository.FlightBookingRepository;
import com.assignment1.travel_booking.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FlightBookingService {
    private final FlightBookingRepository flightBookingRepository;
    private final FlightRepository flightRepository;

    public FlightBookingService(FlightBookingRepository flightBookingRepository, FlightRepository flightRepository) {
        this.flightBookingRepository = flightBookingRepository;
        this.flightRepository = flightRepository;
    }

    public FlightBooking saveFlightBooking(FlightBooking flightBooking) {
        // Load the flight from the database using the flight number
        Flight flight = flightRepository.findById(flightBooking.getFlight().getFlightNumber())
                .orElseThrow(() -> new RuntimeException("Flight not found"));

        // Set the loaded flight to the booking
        flightBooking.setFlight(flight);

        // Now save the booking
        return flightBookingRepository.save(flightBooking);
    }

    public List<FlightBooking> getAllFlightBookings() {
        return flightBookingRepository.findAll();
    }


    public Optional<FlightBooking> getFlightBookingById(Long flightBookingId) {
        return flightBookingRepository.findById(flightBookingId);
    }

    public void deleteFlightBooking(Long flightBookingId) {
        flightBookingRepository.deleteById(flightBookingId);
    }

}
