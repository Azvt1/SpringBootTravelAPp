package com.assignment1.travel_booking.service;

import com.assignment1.travel_booking.dto.BookingDTO;
import com.assignment1.travel_booking.dto.UserDTO;
import com.assignment1.travel_booking.model.Booking;
import com.assignment1.travel_booking.model.User;
import com.assignment1.travel_booking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        ArrayList<Booking> bookingList = new ArrayList<>();
        user.setBookings(bookingList);
        return userRepository.save(user);
    }

    public List<UserDTO> getAllUsers() {
        List<User> users = userRepository.findAll();

        return users.stream().map(user -> new UserDTO(
                user.getUserId(),
                user.getName(),
                user.getPhoneNumber(),
                user.getEmail(),
                user.getBookings().stream().map(booking -> new BookingDTO(
                        booking.getBookingId(),
                        booking.getBookingDate(),
                        booking.getStatus(),
                        booking.getTotalAmount()
                )).collect(Collectors.toList())
        )).collect(Collectors.toList());
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
}
