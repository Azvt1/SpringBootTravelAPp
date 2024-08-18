package com.assignment1.travel_booking.controller;

import com.assignment1.travel_booking.model.Booking;
import com.assignment1.travel_booking.repository.BookingRepository;
import com.assignment1.travel_booking.service.HotelBookingService;

import com.assignment1.travel_booking.model.HotelBooking;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/hotelBookings")

public class HotelBookingController {

    @Autowired
    private HotelBookingService hotelBookingService;

    @Autowired
    private BookingRepository bookingRepository;
	

    @GetMapping
	
    public List<HotelBooking> getAllHotelBookings() {
		
        return hotelBookingService.getAllHotelBookings();
    }


    @PostMapping
	
    public ResponseEntity<HotelBooking> createHotelBooking(@RequestBody HotelBooking hotelBooking) {

        Long bookingId = hotelBooking.getBooking().getBookingId();

        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new IllegalArgumentException("Booking not found, double check booking ID"));
        hotelBooking.setBooking(booking);

        HotelBooking hotelBooking1 = hotelBookingService.createHotelBooking(hotelBooking);

        return ResponseEntity.ok(hotelBooking1);
    }
}
