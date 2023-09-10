package com.example.universitypro.service;

import com.example.universitypro.entity.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAll();

    Student getId(int id);

    void saveUser(Student student);

    void deleteStudent(int id);
}
