package com.assignment1.travel_booking.dto;

import com.assignment1.travel_booking.dto.BookingDTO;

import java.util.List;

public class UserDTO {
    private Long userId;
    private String name;
    private String phoneNumber;
    private String email;
    private List<BookingDTO> bookings;

    public UserDTO() {}

    public UserDTO(Long userId, String name, String phoneNumber, String email, List<BookingDTO> bookings) {
        this.userId = userId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.bookings = bookings;
    }
    public UserDTO(Long userId, String name, String phoneNumber, String email) {
        this.userId = userId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    public Long getUserId() {
        return userId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<BookingDTO> getBookings() {
        return bookings;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setBookings(List<BookingDTO> bookings) {
        this.bookings = bookings;
    }


}
