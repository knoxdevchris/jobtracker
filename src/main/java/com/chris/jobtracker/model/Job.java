package com.chris.jobtracker.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter; 

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Position is required")
    private String position;

    @NotBlank(message = "Company is required")
    private String company;

    @NotBlank(message = "Status is required")
    private String status;

    @NotBlank(message = "Notes is required")
    private String notes;

}
