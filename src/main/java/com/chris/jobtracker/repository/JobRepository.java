package com.chris.jobtracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.chris.jobtracker.model.Job;


@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
    // Basic CRUD methods are already available

    /**
     * Find all jobs by a specific status.
     *
     * @param status the job status to filter by
     * @return jobs matching the given status
     */
    List<Job> findByStatus(String status);
}
