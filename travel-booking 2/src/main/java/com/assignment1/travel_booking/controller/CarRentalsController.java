package com.assignment1.travel_booking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import com.assignment1.travel_booking.model.CarRentals;
import org.springframework.web.bind.annotation.*;
import com.assignment1.travel_booking.service.CarRentalsService;

import java.util.List;

@RestController

@RequestMapping("/carRentals")

public class CarRentalsController {
	

    @Autowired
	
    private CarRentalsService carRentalsService;


    @GetMapping
	
	
    public List<CarRentals> getAllCarRentals() {
		
		
        return carRentalsService.getAllCarRentals();
		
    }
	

    @PostMapping
	
    public CarRentals createCarRental(@RequestBody CarRentals carRental) {
		
        return carRentalsService.createCarRental(carRental);
		
    }
	
}
