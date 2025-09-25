package com.example.scms.dto;

import lombok.Data;

import javax.management.relation.Role;
import java.util.Set;

@Data
public class UserResponseDto {
    private Long id;
    private String email;
    private StudentResponseDto student;
    private FacultyResponseDto faculty;
    private Set<Role> roles;
}


// Note : if use jwt Auth later then use AuthDTO


//@Data
//public class AuthRequestDto {
//    private String email;
//    private String password;
//}
//@Data
//public class AuthResponseDto {
//    private String token;
//    private String role;
//}