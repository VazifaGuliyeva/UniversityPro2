package com.example.universitypro.manager;

import com.example.universitypro.entity.Student;
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

    @Override
    public List<Student> getAll() {

        return studentsRepository.findAll();
    }

    @Override
    public Student getId(int id) {

        return studentsRepository.findById(id).get();
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
