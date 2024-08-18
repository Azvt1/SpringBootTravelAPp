package com.assignment1.travel_booking.dto;

import java.time.LocalDateTime;

public class FlightBookingDTO {
    private Long flightBookingId;

    private Long flightNumber;


    private BookingDTO booking;

    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String departureCity;
    private String arrivalCity;
    private String seatSelection;

    public FlightBookingDTO(Long flightBookingID, Long flightNumber, BookingDTO booking, LocalDateTime departureTime, LocalDateTime arrivalTime,
                            String departureCity, String arrivalCity, String seatSelection) {
        this.flightBookingId = flightBookingID;
        this.flightNumber = flightNumber;
        this.booking = booking;
        this.departureCity = departureCity;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.arrivalCity = arrivalCity;
        this.seatSelection = seatSelection;
    }

    public FlightBookingDTO() {}


    public BookingDTO getBooking() {
        return booking;
    }

    public void setBooking(BookingDTO booking) {
        this.booking = booking;
    }

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

    // Setters

    public void setFlightBookingId(Long flightBookingID) {
        this.flightBookingId = flightBookingID;
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

//    public Long getBookingID() {
//        return bookingID;
//    }

//    public Long getFlightBookingID() {
//        return flightBookingID;
//    }

    public Long getFlightNumber() {
        return flightNumber;
    }

//    public void setBookingID(Long bookingID) {
//        this.bookingID = bookingID;
//    }

    public void setFlightNumber(Long flightNumber) {
        this.flightNumber = flightNumber;
    }

//    public void setFlightBookingID(Long flightBookingID) {
//        this.flightBookingID = flightBookingID;
//    }
}
