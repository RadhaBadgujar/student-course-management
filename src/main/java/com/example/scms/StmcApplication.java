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
//        ApplicationContext context=SpringApplication.run(SpringDataJpaApplication.class,args);
//        context=
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







