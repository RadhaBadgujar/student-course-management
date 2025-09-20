package com.example.scms.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String phone;

    @Column(name="created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

}






//Student (id, first_name, last_name, email, password, phone, created_at, ...)
//
//Faculty (id, name, email, phone, department, ...)
//
//Course (id, title, code, description, faculty_id → Many-to-One Faculty)
//
//Enrollment (id, student_id, course_id, enrolled_on, status) — join table for Student ↔ Course (Many-to-Many through Enrollment)
//
//User / Auth (if you separate auth from domain; or use Student/Faculty as Users)
//
//Role (ROLE_ADMIN, ROLE_FACULTY, ROLE_STUDENT)