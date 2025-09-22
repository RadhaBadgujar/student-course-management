package com.example.scms;

import com.example.scms.entity.Student;

import com.example.scms.repository.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StmcApplication {

    public static void main(String[] args) {
        System.out.println("hello");

        // Start Spring Boot application and get the context
        ApplicationContext context = SpringApplication.run(StmcApplication.class, args);

        // Get the repository bean from context
        StudentRepo studentRepo = context.getBean(StudentRepo.class);


        // Create Student object using Lombok setters
        Student s1 = new Student();
        s1.setFirstName("seldina");
        s1.setLastName("james");
        s1.setEmail("seldina23@example.com");
        s1.setPassword("67892");
        s1.setPhone("1236767880");
       studentRepo.save(s1);
        System.out.println("Student Saved : " + s1);
    }
}



















//    @Bean
//    CommandLineRunner testStud(StudentRepo studentRepo) {
//        return args -> {
//            Student s = Student.builder()
//                    .firstName("John")
//                    .lastName("Doe")
//                    .email("john@example.com")
//                    .password("12345")
//                    .phone("1234567890")
//                    .build();
//
//            studentRepo.save(s);
//            System.out.println("Student saved: " + s);
//        };
//    }







