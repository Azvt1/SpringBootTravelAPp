package com.assignment1.travel_booking.repository;

import com.assignment1.travel_booking.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
