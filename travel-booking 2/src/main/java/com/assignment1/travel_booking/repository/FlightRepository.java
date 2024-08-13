package com.assignment1.travel_booking.repository;

import com.assignment1.travel_booking.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
