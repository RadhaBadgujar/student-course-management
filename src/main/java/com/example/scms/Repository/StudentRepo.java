package com.example.scms.Repository;

import com.example.scms.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

interface StudentRepo extends JpaRepository<Student,Integer> {
}
