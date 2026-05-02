package com.example.fri.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "users_table")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private LocalDate createdAt;

    public User() {
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.createdAt = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }
}