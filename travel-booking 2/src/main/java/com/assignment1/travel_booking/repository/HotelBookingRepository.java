package com.assignment1.travel_booking.repository;

import com.assignment1.travel_booking.model.HotelBooking;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelBookingRepository extends JpaRepository<HotelBooking, Long> {
}
