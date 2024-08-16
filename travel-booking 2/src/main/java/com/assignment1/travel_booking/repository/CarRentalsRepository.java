package com.assignment1.travel_booking.repository;

import com.assignment1.travel_booking.model.CarRentals;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRentalsRepository extends JpaRepository<CarRentals, Long> {
}
