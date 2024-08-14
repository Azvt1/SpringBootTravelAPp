package com.assignment1.travel_booking.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class FlightBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    // Uncomment when Booking entity will be added
//    @ManyToOne
//    private Booking booking;


    @ManyToOne
    @JoinColumn(name = "flightNumber", nullable = false)
    private Flight flight;


    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String departureCity;
    private String arrivalCity;
    private String seatSelection;

    // Getters
    public String getArrivalCity() {
        return arrivalCity;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public Long getId() {
        return id;
    }

    public String getSeatSelection() {
        return seatSelection;
    }

    public Flight getFlight() {
        return flight;
    }

    // Setters

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setSeatSelection(String seatSelection) {
        this.seatSelection = seatSelection;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
