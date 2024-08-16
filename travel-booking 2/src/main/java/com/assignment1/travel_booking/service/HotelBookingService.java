package com.assignment1.travel_booking.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.assignment1.travel_booking.repository.HotelBookingRepository;

import com.assignment1.travel_booking.model.HotelBooking;

import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class HotelBookingService {
	

    @Autowired
	
    private HotelBookingRepository hotelBookingRepository;
	

    public List<HotelBooking> getAllHotelBookings() {
		
        return hotelBookingRepository.findAll();
		
    }

    public HotelBooking createHotelBooking(HotelBooking hotelBooking) {
		
        return hotelBookingRepository.save(hotelBooking);
		
    }
}
