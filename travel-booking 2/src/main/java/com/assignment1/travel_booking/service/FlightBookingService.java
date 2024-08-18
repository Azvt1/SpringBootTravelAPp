package com.assignment1.travel_booking.service;

import com.assignment1.travel_booking.dto.BookingDTO;
import com.assignment1.travel_booking.dto.FlightBookingDTO;
import com.assignment1.travel_booking.model.Flight;
import com.assignment1.travel_booking.model.FlightBooking;
import com.assignment1.travel_booking.repository.FlightBookingRepository;
import com.assignment1.travel_booking.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FlightBookingService {
    private final FlightBookingRepository flightBookingRepository;
    private final FlightRepository flightRepository;

    public FlightBookingService(FlightBookingRepository flightBookingRepository, FlightRepository flightRepository) {
        this.flightBookingRepository = flightBookingRepository;
        this.flightRepository = flightRepository;
    }

    public FlightBooking saveFlightBooking(FlightBooking flightBooking) {
        return flightBookingRepository.save(flightBooking);
    }

    public List<FlightBookingDTO> getAllFlightBookings() {
        List<FlightBooking>flightBookings = flightBookingRepository.findAll();

        return flightBookings.stream().map(flightBooking -> new FlightBookingDTO(
                flightBooking.getFlightBookingId(),
                flightBooking.getFlight().getFlightNumber(),
                new BookingDTO(flightBooking.getBooking().getBookingId(), flightBooking.getBooking().getBookingDate(), flightBooking.getBooking().getStatus(), flightBooking.getBooking().getTotalAmount(), flightBooking.getBooking().getUser().getUserId()),
                flightBooking.getDepartureTime(),
                flightBooking.getArrivalTime(),
                flightBooking.getDepartureCity(),
                flightBooking.getArrivalCity(),
                flightBooking.getSeatSelection()
        )).collect(Collectors.toList());
    }


    public Optional<FlightBooking> getFlightBookingById(Long flightBookingId) {
        return flightBookingRepository.findById(flightBookingId);
    }

    public void deleteFlightBooking(Long flightBookingId) {
        flightBookingRepository.deleteById(flightBookingId);
    }

}
