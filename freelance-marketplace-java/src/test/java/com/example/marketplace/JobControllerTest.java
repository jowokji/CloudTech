package com.example.freelance.controller;

import com.example.freelance.service.JobService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @PostMapping("/create")
    public String createJob(@RequestParam String title) {
        jobService.createJob(title);
        return "Job created: " + title;
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }
}
