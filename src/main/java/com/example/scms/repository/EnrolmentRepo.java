package com.example.scms.repository;

import com.example.scms.entity.Enrolment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrolmentRepo extends JpaRepository<Enrolment,Long> {
}
