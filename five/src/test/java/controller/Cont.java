package com.example.five.controller;

import com.example.five.model.User;
import com.example.five.service.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Cont {

    @Autowired
    private Users users;

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "register"; // имя шаблона register.html
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user, Model model) {
        users.register(user);  // сохраняем пользователя
        model.addAttribute("user", user);
        return "register"; // пока просто остаёмся на той же странице
    }
}