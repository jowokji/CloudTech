
package com.example.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @GetMapping
    public String getAll() {
        return "List of payment";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Welcome to Payment Service!";
    }
}
