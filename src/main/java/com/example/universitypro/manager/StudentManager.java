package com.example.universitypro.manager;

import com.example.universitypro.dto.StudentDto;
import com.example.universitypro.dto.StudentDtoManager;
import com.example.universitypro.entity.Student;
import com.example.universitypro.exception.StudentNotFoundException;
import com.example.universitypro.repository.StudentsRepository;
import com.example.universitypro.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
@AllArgsConstructor
public class StudentManager implements StudentService {

    private final StudentsRepository studentsRepository;
    private final StudentDtoManager studentDtoManager;

    @Override
    public List<StudentDto> getAll() {

        return studentsRepository.findAll().stream().map(studentDtoManager).toList();
    }

    @Override
    public StudentDto getId(int id) {

        return studentsRepository.findById(id).stream().map(studentDtoManager).findFirst().
                orElseThrow(()->new StudentNotFoundException("Student is not found"));
    }

    @Override
    public void saveUser(Student student) {
        studentsRepository.save(student);

    }

    @Override
    public void deleteStudent(int id) {
        studentsRepository.deleteById(id);

    }
}
