package com.example.scms.repository;

import com.example.scms.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepo  extends JpaRepository<Faculty,Long> {
}
