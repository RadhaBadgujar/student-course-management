package com.example.scms.Services;

import com.example.scms.dto.StudentRequestDto;
import com.example.scms.dto.StudentResponseDto;
import com.example.scms.entity.Student;
import com.example.scms.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;

    public StudentResponseDto addStudents(StudentRequestDto studentRequestDto){
        //DTO ->Entity Mapping
        Student student = Student.builder()
                .firstName(studentRequestDto.getFirstName())
                .lastName(studentRequestDto.getLastName())
                .email(studentRequestDto.getEmail())
                .password(studentRequestDto.getPassword())
                .phone(studentRequestDto.getPhone())
             //   .createdAt(LocalDateTime.now())   // ✅ added line
                .build();
        //  return studentRepo.save(student);
        Student savedStudent = studentRepo.save(student);
        // Entity → Response DTO mapping
        return StudentResponseDto.builder()
                .id(savedStudent.getId())
                .firstName(savedStudent.getFirstName())
                .lastName(savedStudent.getLastName())
                .email(savedStudent.getEmail())
                .phone(savedStudent.getPhone())
                .createdAt(savedStudent.getCreatedAt())
                .build();
    }
}
/*@Builder aap DTO aur Entity dono pe use kar sakte ho, lekin service me aapko entity save karni hai → to Student entity
pe @Builder hona chahiye.*/