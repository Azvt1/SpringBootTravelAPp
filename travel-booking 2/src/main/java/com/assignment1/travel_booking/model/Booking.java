package com.assignment1.travel_booking.model;

import com.assignment1.travel_booking.model.User;
import com.assignment1.travel_booking.model.CarRentals;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;
    private Date bookingDate;
    private String status;
    private Integer totalAmount;


    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
    private List<FlightBooking> flightBookings;

    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
    private List<HotelBooking> hotelBookings;

    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
    private List<CarRentals> carRentals;


    public void setStatus(String status) {
        this.status = status;
    }

    public Booking() {
    }


    public void setUser(User user) {
        this.user = user;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public void setFlightBookings(List<FlightBooking> flightBookings) {
        this.flightBookings = flightBookings;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setCarRentals(List<CarRentals> carRentals) {
        this.carRentals = carRentals;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public User getUser() {
        return user;
    }
    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public List<CarRentals> getCarRentals() {
        return carRentals;
    }

    public List<FlightBooking> getFlightBookings() {
        return flightBookings;
    }

    public List<HotelBooking> getHotelBookings() {
        return hotelBookings;
    }


    public void setHotelBookings(List<HotelBooking> hotelBookings) {
        this.hotelBookings = hotelBookings;
    }
}
