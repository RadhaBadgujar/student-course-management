package com.example.scms.controller;

import com.example.scms.Services.StudentService;
import com.example.scms.dto.StudentRequestDto;
import com.example.scms.dto.StudentResponseDto;
import com.example.scms.entity.Student;
import com.example.scms.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")          //if write wcnfg dnt use
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    StudentService studentService;

    @GetMapping
    public List<Student> getAllStud(){
        return  studentRepo.findAll();
    }
//    @PostMapping("/students")
//    public Student addStudents(@RequestBody Student s){
//        return studentRepo.save(s);
//    }
//
//    @PutMapping("/students/{id}")
//    public Student updateStudent(@RequestBody Student s,  @PathVariable Long id){
//        s.setId(id);
//        return studentRepo.save(s);
//    }
//    @DeleteMapping("/students/{id}")
//    public  String DelStudent(@PathVariable long id){
//        studentRepo.deleteById(id);
//        return  "Student deleted";
//    }
    // Create Student API
//    @PostMapping
//    public StudentResponseDto createStudent(@RequestBody StudentRequestDto studentRequestDto) {
//        return studentService.addStudents(studentRequestDto);
//    }
}
