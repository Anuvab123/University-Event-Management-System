package com.geekster.UniversityEventManagement.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer StudentId;
    @Pattern(regexp = "[A-Z][a-z]*", message = "First name should start with a capital letter")
    private String firstName;
    @Pattern(regexp = "[A-Z][a-z]*", message = "First name should start with a capital letter")
    private String lastName;
    @Min(value=18)
    @Max(value=25)
    private Integer age;
    private String dept;
}
