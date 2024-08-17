package com.assignment1.travel_booking.service;

import com.assignment1.travel_booking.model.Booking;
import com.assignment1.travel_booking.model.User;
import com.assignment1.travel_booking.repository.BookingRepository;
import com.assignment1.travel_booking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    public Booking createBooking(Booking booking) {
        if (booking.getUser() == null || booking.getUser().getUserId() == null) {
            throw new IllegalArgumentException("User_id must be provided");
        }

        Optional<User> userOptional = userService.getUserById(booking.getUser().getUserId());

        if (!userOptional.isPresent()) {
            throw new IllegalArgumentException("User was not found");
        }


        booking.getUser().setName(userOptional.get().getName());
        booking.getUser().setEmail(userOptional.get().getEmail());

        return bookingRepository.save(booking);
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking getBookingById(Long id) {
        return bookingRepository.findById(id).orElse(null);
    }
}
