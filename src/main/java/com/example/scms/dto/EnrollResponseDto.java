package com.example.scms.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EnrollResponseDto {
    private Long id;
    private StudentResponseDto student;
    private CourseResponseDto course;
    private LocalDateTime enrolledOn;
    private String status;
}
