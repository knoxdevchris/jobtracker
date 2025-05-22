package com.chris.jobtracker.controller;

import org.springframework.web.bind.annotation.*;

import com.chris.jobtracker.model.Job;
import com.chris.jobtracker.repository.JobRepository;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    private final JobRepository jobRepository;

    public JobController(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @GetMapping
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }
}
