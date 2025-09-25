package com.example.scms.dto;

// FacultyResponseDto.java


import lombok.Data;

@Data
public class FacultyResponseDto {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String department;
}
