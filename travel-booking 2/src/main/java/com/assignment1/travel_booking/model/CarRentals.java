package com.assignment1.travel_booking.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class CarRentals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carRentalId;
    private String carType;
    private String rentalCompany;
    private double pricePerDistance;
    private Date pickUpDate;
    private Date pickUpTime;
    private double totalDistanceTraveled;
    private double totalPrice;

    @ManyToOne
    @JoinColumn(name = "bookingId", nullable = false)
    private Booking booking;


    // Getters and Setters
    public Long getCarRentalId() {
        return carRentalId;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public void setCarRentalId(Long carRentalId) {
        this.carRentalId = carRentalId;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getRentalCompany() {
        return rentalCompany;
    }

    public void setRentalCompany(String rentalCompany) {
        this.rentalCompany = rentalCompany;
    }

    public double getPricePerDistance() {
        return pricePerDistance;
    }

    public void setPricePerDistance(double pricePerDistance) {
        this.pricePerDistance = pricePerDistance;
    }

    public Date getPickUpDate() {
        return pickUpDate;
    }

    public void setPickUpDate(Date pickUpDate) {
        this.pickUpDate = pickUpDate;
    }

    public Date getPickUpTime() {
        return pickUpTime;
    }

    public void setPickUpTime(Date pickUpTime) {
        this.pickUpTime = pickUpTime;
    }

    public double getTotalDistanceTraveled() {
        return totalDistanceTraveled;
    }

    public void setTotalDistanceTraveled(double totalDistanceTraveled) {
        this.totalDistanceTraveled = totalDistanceTraveled;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
