package com.jobtracker.JobApplicationTracker.repository;

import com.jobtracker.JobApplicationTracker.model.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {
}
