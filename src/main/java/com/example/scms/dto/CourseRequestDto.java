package com.example.scms.dto;


// CourseRequestDto.java
import lombok.Data;

@Data
public class CourseRequestDto {
    private String title;
    private String code;
    private String description;
    private Long facultyId;    // only ID needed in request
}

