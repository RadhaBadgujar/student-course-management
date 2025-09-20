package com.example.scms.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.Text;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="course")
public class Course {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

   @Column(nullable = false)
    private  String title;

    @Column(unique = true)
    private  String code;

    @Column(columnDefinition ="TEXT")
    private  String description;

    @ManyToOne
    @JoinColumn(name="faculty_id")
    private Faculty faculty;


}
//Course (id, title, code, description, faculty_id → Many-to-One Faculty)