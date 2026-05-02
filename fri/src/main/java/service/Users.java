package com.example.fri.service;

import com.example.fri.model.User;
import com.example.fri.repository.Userr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Users {

    @Autowired
    private Userr userRepository;

    public void createUser(String name, String email) {
        User user = new User(name, email);
        userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}