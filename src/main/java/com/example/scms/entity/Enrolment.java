package com.example.scms.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="enrolment")
public class Enrolment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

@ManyToOne
    @JoinColumn (name="student_id")
    private  Student stud;

@ManyToOne
@JoinColumn(name="course_id")
private  Course course;

@Column(name="enrolled_on")
    private LocalDateTime enrolled_on;

    private  String status;

}
//Enrollment (id, student_id, course_id, enrolled_on, status) — join table for Student ↔ Course (Many-to-Many through Enrollment)
//