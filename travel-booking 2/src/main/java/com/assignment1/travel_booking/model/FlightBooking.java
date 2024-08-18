package com.assignment1.travel_booking.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class FlightBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long flightBookingId;


    @ManyToOne
    @JoinColumn(name = "flightNumber", nullable = false)
    private Flight flight;

    @ManyToOne
    @JoinColumn(name = "bookingId", nullable = false)
    private Booking booking;


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

    public Long getFlightBookingId() {
        return flightBookingId;
    }

    public String getSeatSelection() {
        return seatSelection;
    }

    public Flight getFlight() {
        return flight;
    }

    public Booking getBooking() {
        return booking;
    }

    // Setters


    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public void setFlightBookingId(Long flightBookingId) {
        this.flightBookingId = flightBookingId;
    }

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
