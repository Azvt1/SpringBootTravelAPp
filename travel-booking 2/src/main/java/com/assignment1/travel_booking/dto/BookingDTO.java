package com.assignment1.travel_booking.dto;

import com.assignment1.travel_booking.model.User;

import java.util.Date;

public class BookingDTO {
    private Long bookingID;
    private Date bookingDate;
    private String status;
    private Integer totalAmount;

    private Long userId;

    public BookingDTO() {

    }

    public BookingDTO(Long bookingID, Date bookingDate, String status, Integer totalAmount) {
        this.bookingID = bookingID;
        this.bookingDate = bookingDate;
        this.status = status;
        this.totalAmount = totalAmount;
    }

    public BookingDTO(Long bookingID, Date bookingDate, String status, Integer totalAmount, Long userId) {
        this.bookingID = bookingID;
        this.bookingDate = bookingDate;
        this.status = status;
        this.totalAmount = totalAmount;
        this.userId = userId;
    }

    public void setBookingID(Long bookingID) {
        this.bookingID = bookingID;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public Long getBookingID() {
        return bookingID;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public Long getUserId() {
        return userId;
    }
}

