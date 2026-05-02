package com.example.four.repository;

import com.example.four.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Userr extends JpaRepository<User, Long> {

    Optional<User> findByLogin(String login);
}