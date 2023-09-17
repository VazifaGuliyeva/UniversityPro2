package com.example.universitypro.manager;

import com.example.universitypro.dto.TeacherDto;
import com.example.universitypro.dto.TeacherDtoManager;
import com.example.universitypro.entity.Teacher;
import com.example.universitypro.exception.TeacherNotFoundException;
import com.example.universitypro.repository.TeacherRepository;
import com.example.universitypro.service.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
@AllArgsConstructor
public class TeacherManager implements TeacherService {
     private final TeacherRepository teacherRepository;
     private final TeacherDtoManager teacherDtoManager;


    @Override
    public List<TeacherDto> getAll() {

        return teacherRepository.findAll().stream().map(teacherDtoManager).toList();
    }

    @Override
    public TeacherDto getById(int id) {

        return teacherRepository.findById(id).stream().map(teacherDtoManager).findFirst().
                orElseThrow(()->new TeacherNotFoundException("Teacher is not found"));
    }

    @Override
    public void saveTeacher(Teacher teacher) {
        teacherRepository.save(teacher);

    }

    @Override
    public void deleteTeacher(int id) {
         teacherRepository.deleteById(id);

    }
}
