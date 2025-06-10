package com.chris.jobtracker.repository;

import com.chris.jobtracker.model.Job;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class JobRepositoryTests {

    @Autowired
    private JobRepository jobRepository;

    @Test
    void findByStatusReturnsMatchingJobs() {
        Job job1 = new Job();
        job1.setPosition("Dev");
        job1.setCompany("Acme");
        job1.setStatus("Applied");
        job1.setNotes("note1");
        jobRepository.save(job1);

        Job job2 = new Job();
        job2.setPosition("DevOps");
        job2.setCompany("Other");
        job2.setStatus("Interview");
        job2.setNotes("note2");
        jobRepository.save(job2);

        List<Job> applied = jobRepository.findByStatus("Applied");
        assertThat(applied).hasSize(1);
        assertThat(applied.get(0).getCompany()).isEqualTo("Acme");
    }
}
