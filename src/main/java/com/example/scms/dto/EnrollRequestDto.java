package com.example.scms.dto;

import lombok.Data;

@Data
public class EnrollRequestDto {
    private Long studentId;
    private Long courseId;
    private String status; // optional at creation, can default ACTIVE
}
