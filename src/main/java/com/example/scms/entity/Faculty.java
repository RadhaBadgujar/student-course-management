package com.example.scms.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="faculty")
public class Faculty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private  long id;
  private  String name;
    private  String email;
    private  String phone;
    private  String department;
}
//Faculty (id, name, email, phone, department, ...)