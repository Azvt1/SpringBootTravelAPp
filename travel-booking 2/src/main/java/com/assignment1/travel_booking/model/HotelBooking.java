package com.assignment1.travel_booking.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class HotelBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotelBookingId;
    private String location;

    private String hotelName;
    private double pricePerNight;
    private Date checkInDate;
    private Date checkOutDate;
    private double totalPrice;


    @ManyToOne
    @JoinColumn(name = "bookingId", nullable = false)
    private Booking booking;

    // Getters and Setters
    public Long getHotelBookingId() {
        return hotelBookingId;
    }

    public Booking getBooking() {
        return booking;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelBookingId(Long hotelId) {
        this.hotelBookingId = hotelId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
}
