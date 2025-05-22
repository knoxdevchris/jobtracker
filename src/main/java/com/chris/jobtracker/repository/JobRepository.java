package com.chris.jobtracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chris.jobtracker.model.Job;


@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
    // Basic CRUD methods are already available
}
