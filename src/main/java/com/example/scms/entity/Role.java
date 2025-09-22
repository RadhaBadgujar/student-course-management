package com.example.scms.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "role")

public class Role {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
   private  String name;
}

//roles → what permissions the user has (ROLE_ADMIN, ROLE_FACULTY, ROE_STUDENT)