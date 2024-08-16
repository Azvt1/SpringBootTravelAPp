package com.assignment1.travel_booking.repository;


import com.assignment1.travel_booking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
