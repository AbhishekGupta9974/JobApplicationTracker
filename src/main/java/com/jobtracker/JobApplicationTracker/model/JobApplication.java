package com.jobtracker.JobApplicationTracker.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "job_applications")
@Data  // Generates getters, setters, toString, equals, hashCode
@NoArgsConstructor  // Generates a no-args constructor
@AllArgsConstructor  // Generates an all-args constructor
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;
    private String position;
    private String status;
    private LocalDate appliedDate;
    private String notes;
}
