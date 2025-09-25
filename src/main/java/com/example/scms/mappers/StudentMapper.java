package com.example.scms.mappers;

import com.example.scms.dto.StudentResponseDto;
import com.example.scms.entity.Student;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")     // generates a Spring bean
public interface StudentMapper {

    //Entity ->DTO
    StudentResponseDto toDto(Student student);

    // DTO -> Entity
Student toEntity(StudentResponseDto studentResponseDto);




}
