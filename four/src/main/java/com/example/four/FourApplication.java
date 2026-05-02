package com.example.four;

import com.example.four.model.User;
import com.example.four.service.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class FourApplication {

    @Autowired
    private Users users;

    public static void main(String[] args) {
        SpringApplication.run(FourApplication.class, args);
    }

    @PostConstruct
    public void run() {
        // регистрация
        users.register(new User("admin", "1234", "Иван Иванов", "999999", "ivan@mail.com"));

        // авторизация
        boolean result = users.login("admin", "1234");

        if (result) {
            System.out.println("Успешный вход!");
        } else {
            System.out.println("Ошибка входа!");
        }
    }
}