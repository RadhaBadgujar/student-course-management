package com.example.scms;

import com.example.scms.entity.Faculty;
import com.example.scms.entity.Student;

import com.example.scms.repository.FacultyRepo;
import com.example.scms.repository.StudentRepo;
import com.example.scms.repository.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StmcApplication {

    public static void main(String[] args) {


        // Start Spring Boot application and get the context
        ApplicationContext context = SpringApplication.run(StmcApplication.class, args);

        // Get the repository bean from context
      StudentRepo studentRepo = context.getBean(StudentRepo.class);
        // Create Student object using Lombok setters
       Student s1 = new Student();
      //  System.out.println(studentRepo.findById(1L));
//        s1.setFirstName("ekta ");
//        s1.setLastName("kalathiya");
//        s1.setEmail("ekt223@example.com");
//        s1.setPassword("57892");
//        s1.setPhone("7036767880");
//       studentRepo.save(s1);
//        System.out.println("Student Saved : " + s1);

        FacultyRepo facultyRepo=context.getBean(FacultyRepo.class);
       // System.out.println(facultyRepo.findAll());
        UserRepo userRepo=context.getBean(UserRepo.class);
     //   System.out.println(userRepo.findAll());
//        Faculty f1= new Faculty();
//        f1.setName("Janvi Gupta");
//        f1.setPhone("1234678967");
//        f1.setEmail("jnvi12@gmal.com");
//        f1.setDepartment("IT");
//        Faculty f2= new Faculty();
        //System.out.println(facultyRepo.findById(1L));
        //System.out.println(facultyRepo.findAll());
      //   facultyRepo.delete(f2) ;
     //   System.out.println("Recod Inserted ");
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







