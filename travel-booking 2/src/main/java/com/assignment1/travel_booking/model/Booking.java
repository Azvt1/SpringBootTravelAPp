package com.assignment1.travel_booking.model;

import com.assignment1.travel_booking.model.User;
import com.assignment1.travel_booking.model.CarRentals;
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

    @OneToMany(mappedBy = "Booking", cascade = CascadeType.ALL)
    private List<FlightBooking> flightBookings;

    @OneToMany(mappedBy = "Booking", cascade = CascadeType.ALL)
    private List<HotelBooking> hotelBookings;




    @OneToMany(mappedBy = "Booking", cascade = CascadeType.ALL)

    private List<CarRentals> carRentals;

}
