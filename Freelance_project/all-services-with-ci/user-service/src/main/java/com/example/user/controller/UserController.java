
package com.example.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @GetMapping
    public String getAll() {
        return "List of user";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Welcome to User Service!";
    }
}
