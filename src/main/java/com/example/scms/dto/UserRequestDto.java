package com.example.scms.dto;

import lombok.Data;

import java.util.Set;

@Data
public class UserRequestDto {
    private String email;
    private String password;
    private Long studentId;   // if this is a student user
    private Long facultyId;   // if this is a faculty user
    private Set<Long> roleIds; // pass role ids
}
