package com.example.fri.repository;

import com.example.fri.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userr extends JpaRepository<User, Long> {
}