package com.example.fri;

import com.example.fri.service.Users;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FriApplication {

    @Autowired
    private Users users;

    public static void main(String[] args) {
        SpringApplication.run(FriApplication.class, args);
    }

    @PostConstruct
    public void run() {
        users.createUser("Иван", "ivan@mail.com");
        users.createUser("Петр", "petr@mail.com");

        System.out.println("Список пользователей:");

        users.getAllUsers().forEach(user ->
                System.out.println(
                        user.getId() + ". " +
                                user.getName() + " - " +
                                user.getEmail() + " - " +
                                user.getCreatedAt()
                )
        );
    }
}