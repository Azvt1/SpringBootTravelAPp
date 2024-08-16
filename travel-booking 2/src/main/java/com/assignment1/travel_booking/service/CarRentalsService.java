package com.assignment1.travel_booking.service;

import com.assignment1.travel_booking.repository.CarRentalsRepository;
import com.assignment1.travel_booking.model.CarRentals;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class CarRentalsService {
	

    @Autowired
	
    private CarRentalsRepository carRentalsRepository;
	

    public List<CarRentals> getAllCarRentals() {
		
        return carRentalsRepository.findAll();
		
    }

    public CarRentals createCarRental(CarRentals carRental) {
		
        return carRentalsRepository.save(carRental);
		
    }
}
