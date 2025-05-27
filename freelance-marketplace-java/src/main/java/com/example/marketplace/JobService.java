package com.example.freelance.service;

import com.example.freelance.metrics.JobMetrics;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    private final JobMetrics jobMetrics;

    public JobService(JobMetrics jobMetrics) {
        this.jobMetrics = jobMetrics;
    }

    public void createJob(String title) {
        // Здесь будет логика создания job (например, сохранение в БД)
        System.out.println("Job created: " + title);
        jobMetrics.incrementJobCounter();
    }
}
