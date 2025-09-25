package com.example.scms.repository;

import com.example.scms.entity.Faculty;
import com.example.scms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Long> {

}
