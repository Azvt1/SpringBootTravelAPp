package com.assignment1.travel_booking.service;

import com.assignment1.travel_booking.dto.BookingDTO;
import com.assignment1.travel_booking.model.Booking;
import com.assignment1.travel_booking.model.User;
import com.assignment1.travel_booking.repository.BookingRepository;
import com.assignment1.travel_booking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    public BookingDTO createBooking(Booking booking) {
        if (booking.getUser() == null || booking.getUser().getUserId() == null) {
            throw new IllegalArgumentException("User_id must be provided");
        }

        Optional<User> userOptional = userService.getUserById(booking.getUser().getUserId());

        if (!userOptional.isPresent()) {
            throw new IllegalArgumentException("User was not found");
        }

        bookingRepository.save(booking);

        return new BookingDTO(
                booking.getBookingId(),
                booking.getBookingDate(),
                booking.getStatus(),
                booking.getTotalAmount(),
                booking.getUser().getUserId()
        );
    }

    public List<BookingDTO> getAllBookings() {

        List<Booking> bookings = bookingRepository.findAll();

        return bookings.stream().map(booking -> new BookingDTO(
                booking.getBookingId(),
                booking.getBookingDate(),
                booking.getStatus(),
                booking.getTotalAmount(),
                booking.getUser().getUserId()
        )).collect(Collectors.toList());
    }

    public Booking getBookingById(Long id) {
        return bookingRepository.findById(id).orElse(null);
    }
}
