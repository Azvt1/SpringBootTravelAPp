package com.assignment1.travel_booking.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Flight {
    @Id
    private Long flightNumber;


    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String originCity;
    private String arrivalCity;

    public Flight () {}

    public Flight (Long flightNumber, LocalDateTime departureTime, LocalDateTime arrivalTime, String originCity, String arrivalCity) {
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.originCity = originCity;
        this.arrivalCity = arrivalCity;
    }

    // Setters
    public void setFlightNumber(Long flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    // Getters
    public Long getFlightNumber() {
        return flightNumber;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public String getOriginCity() {
        return originCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }
}
