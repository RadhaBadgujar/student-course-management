package com.example.scms.repository;

import com.example.scms.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo  extends JpaRepository<Role,Long> {
}
