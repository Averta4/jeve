package com.example.four.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users_table") // важно! не "user"
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;
    private String password;
    private String fullName;
    private String phone;
    private String email;

    public User() {}

    public User(String login, String password, String fullName, String phone, String email) {
        this.login = login;
        this.password = password;
        this.fullName = fullName;
        this.phone = phone;
        this.email = email;
    }

    public Long getId() { return id; }
    public String getLogin() { return login; }
    public String getPassword() { return password; }
    public String getFullName() { return fullName; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }

    public void setLogin(String login) { this.login = login; }
    public void setPassword(String password) { this.password = password; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email; }
}