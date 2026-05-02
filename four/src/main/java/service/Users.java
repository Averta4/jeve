package com.example.four.service;

import com.example.four.model.User;
import com.example.four.repository.Userr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Users {

    @Autowired
    private Userr userRepository;

    // регистрация
    public void register(User user) {
        userRepository.save(user);
    }

    // авторизация
    public boolean login(String login, String password) {
        Optional<User> user = userRepository.findByLogin(login);
        return user.isPresent() && user.get().getPassword().equals(password);
    }
}