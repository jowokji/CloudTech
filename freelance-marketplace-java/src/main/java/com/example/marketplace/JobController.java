package com.example.marketplace;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class JobController {

    @GetMapping("/jobs")
    public List<String> getJobs() {
        return List.of("Backend Developer", "Frontend Developer", "QA Tester");
    }
}