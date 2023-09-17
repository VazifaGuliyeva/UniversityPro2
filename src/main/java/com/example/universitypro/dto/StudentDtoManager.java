package com.example.universitypro.dto;

import com.example.universitypro.entity.Student;
import org.springframework.stereotype.Component;

import java.util.function.Function;
@Component
public class StudentDtoManager implements Function<Student,StudentDto> {
    @Override
    public StudentDto apply(Student student) {
        return  new StudentDto(student.getFullName(),student.getAge(),student.getClassNumber());
    }
}
