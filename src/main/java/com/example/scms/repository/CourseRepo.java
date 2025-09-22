package com.example.scms.repository;

import com.example.scms.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo  extends JpaRepository<Course,Long> {
}
