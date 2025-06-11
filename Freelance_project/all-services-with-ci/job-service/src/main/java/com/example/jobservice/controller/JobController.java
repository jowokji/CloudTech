
package com.example.jobservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Job Service!";
    }

    @GetMapping("/api/jobs")
    public String getJobs() {
        return "List of jobs";
    }
}
