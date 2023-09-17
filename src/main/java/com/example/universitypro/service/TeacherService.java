package com.example.universitypro.service;

import com.example.universitypro.dto.TeacherDto;
import com.example.universitypro.entity.Teacher;

import java.util.List;

public interface  TeacherService {

    List<TeacherDto> getAll();

    TeacherDto getById(int id);

    void saveTeacher(Teacher teacher);

    void deleteTeacher(int id);
}
