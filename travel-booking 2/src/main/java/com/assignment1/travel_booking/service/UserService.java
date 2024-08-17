package com.assignment1.travel_booking.service;

import com.assignment1.travel_booking.model.Booking;
import com.assignment1.travel_booking.model.User;
import com.assignment1.travel_booking.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        ArrayList<Booking> bookingList = new ArrayList<>();
        user.setBookings(bookingList);
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
}
