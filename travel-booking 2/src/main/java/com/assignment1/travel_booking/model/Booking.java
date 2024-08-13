package com.assignment1.travelbooking.model;

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
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
    private List<FlightBooking> flightBookings;

    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
    private List<HotelBooking> hotelBookings;

    @OneToMany(mappedBy = "booking", cascade = CascadeType.ALL)
    private List<CarRental> carRentals;

}
