package com.example.scms.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

//@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "student")
@Builder
public class
Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String phone;


    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    // 👇 Ye method automatic trigger hoga save() se pehle
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

}
/*⚠️1 OPTION : Lekin jab aap Student.builder() use karte ho, to Lombok ka @Builder default values ko ignore karta hai.
Matlab createdAt ka default LocalDateTime.now() builder se object banate waqt set nahi hota → isliye null save ho raha hai → response me bhi null.
👉 Ab jab bhi naya Student save hoga, createdAt DB me automatically set ho jaayega, chahe builder use karo ya constructor.

So USe  @PrePersist  Anno in Stud Entity

2 OPTION
        .createdAt(LocalDateTime.now())   // ✅ added line

* */

































































































































































