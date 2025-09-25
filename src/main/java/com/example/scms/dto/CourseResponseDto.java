package com.example.scms.dto;



import lombok.Data;

@Data
public class CourseResponseDto {
    private Long id;
    private String title;
    private String code;
    private String description;
    private FacultyResponseDto faculty; // nested faculty details
}
