package com.example.universitypro.manager;

import com.example.universitypro.entity.Teacher;
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


    @Override
    public List<Teacher> getAll() {

        return teacherRepository.findAll();
    }

    @Override
    public Teacher getById(int id) {

        return teacherRepository.findById(id).get();
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
