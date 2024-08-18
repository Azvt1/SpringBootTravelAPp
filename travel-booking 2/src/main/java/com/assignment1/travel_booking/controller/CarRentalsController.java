package com.assignment1.travel_booking.controller;

import com.assignment1.travel_booking.model.Booking;
import com.assignment1.travel_booking.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.assignment1.travel_booking.model.CarRentals;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.assignment1.travel_booking.service.CarRentalsService;

import java.util.List;

@RestController

@RequestMapping("/carRentals")

public class CarRentalsController {
	


    private final BookingRepository bookingRepository;
    private final CarRentalsService carRentalsService;

    public CarRentalsController(BookingRepository bookingRepository, CarRentalsService carRentalsService) {
        this.bookingRepository = bookingRepository;
        this.carRentalsService = carRentalsService;
    }

    @GetMapping
	
	
    public List<CarRentals> getAllCarRentals() {
		
		
        return carRentalsService.getAllCarRentals();
		
    }
	

    @PostMapping
	
    public ResponseEntity<CarRentals> createCarRental(@RequestBody CarRentals carRental) {
		Long bookingId = carRental.getBooking().getBookingId();
        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found, double check booking ID"));

        carRental.setBooking(booking);

        CarRentals carRentals = carRentalsService.createCarRental(carRental);

        return ResponseEntity.ok(carRentals);

    }
	
}
