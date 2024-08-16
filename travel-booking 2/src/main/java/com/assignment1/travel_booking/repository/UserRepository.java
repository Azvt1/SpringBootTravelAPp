package com.assignment1.travelbooking.repository;

import com.assignment1.travelbooking.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
