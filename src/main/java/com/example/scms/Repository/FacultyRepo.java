package com.example.scms.Repository;

import com.example.scms.Entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepo  extends JpaRepository<Faculty,Integer> {
}
