package com.example.scms.dto;

import lombok.Builder;
import lombok.Data;

// StudentRequestDto.java

@Data
@Builder
public class StudentRequestDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;
}

