package com.chris.jobtracker.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import com.chris.jobtracker.model.Job;
import com.chris.jobtracker.repository.JobRepository;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/jobs")
@CrossOrigin(origins = "*")
public class JobController {

    private final JobRepository jobRepository;

    public JobController(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @GetMapping
    public List<Job> getAllJobs(@RequestParam(required = false) String status) {
        if (status != null && !status.isBlank()) {
            return jobRepository.findByStatus(status);
        }
        return jobRepository.findAll();
    }

    @PostMapping
    public Job createJob(@Valid @RequestBody Job job){
        return jobRepository.save(job);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors().forEach(error ->
            errors.put(error.getField(), error.getDefaultMessage()));
        return errors;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Job> updateJob(@PathVariable Long id, @Valid @RequestBody Job updatedJob) {
        return jobRepository.findById(id)
            .map(job -> {
                job.setPosition(updatedJob.getPosition());
                job.setCompany(updatedJob.getCompany());
                job.setStatus(updatedJob.getStatus());
                job.setNotes(updatedJob.getNotes());
                return ResponseEntity.ok(jobRepository.save(job));
            })
            .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteJob(@PathVariable Long id) {
        return jobRepository.findById(id)
            .map(job -> {
                jobRepository.delete(job);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT); // explicit and clean
            })
            .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


}
