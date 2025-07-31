package com.codex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codex.model.User;

@RestController
public class UserController {

    @GetMapping("/api/users")
    public User getUser() {
        User user = new User();
        user.setEmail("ruwini@gmail.com");
        user.setFullName("Ruwini Tharanga");
        user.setPhone("0771234567");
        user.setRole("Customer");
        return user;
    }
}
