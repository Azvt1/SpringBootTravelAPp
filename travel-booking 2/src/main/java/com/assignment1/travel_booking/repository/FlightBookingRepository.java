package com.assignment1.travel_booking.repository;

import com.assignment1.travel_booking.model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FlightBookingRepository extends JpaRepository<FlightBooking, Long> {
}
