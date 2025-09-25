package com.example.scms.dto;

public class AuthResponse {
    private  String token;
    private  String role;
}
//🔹 What is MapStruct?
//
//MapStruct is a Java annotation processor that generates the code for mapping between objects (like Entity ↔ DTO).
//
//It avoids boilerplate code (getters/setters copying).
//
//At compile time, it generates the mapper implementations, so no runtime overhead.
//
//Example: convert Student entity to StudentResponseDto and back to StudentRequestDto.