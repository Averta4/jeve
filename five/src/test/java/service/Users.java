package com.example.five.service;

import com.example.five.model.User;
import com.example.five.repository.Userr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Users {

    @Autowired
    private Userr userr;

    public void register(User user) {
        userr.save(user);
    }

    public boolean login(String login, String password) {
        return userr.findByLogin(login)
                .map(u -> u.getPassword().equals(password))
                .orElse(false);
    }
}