package ru.netology.springmvc.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
    @NotBlank
    @Size(min = 3, max = 10)
    private String userName;

    @NotBlank
    @Size(min = 4, max = 15)
    private String password;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}
