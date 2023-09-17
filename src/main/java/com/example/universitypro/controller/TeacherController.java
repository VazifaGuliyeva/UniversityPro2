package com.example.universitypro.controller;


import com.example.universitypro.dto.TeacherDto;
import com.example.universitypro.entity.Teacher;
import com.example.universitypro.manager.TeacherManager;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/teachers")
public class TeacherController {
    private final TeacherManager teacherManager;
    @GetMapping
    public List<TeacherDto> getAll(){
        return teacherManager.getAll();
    }
    @GetMapping("/{id}")
    public TeacherDto getById(@PathVariable int id){
        return teacherManager.getById(id);
    }
    @PostMapping
    @ResponseStatus(code= HttpStatus.CREATED)
    public void saveTeacher(@RequestBody Teacher teacher){
        teacherManager.saveTeacher(teacher);
    }
    @DeleteMapping("{id}")
    public void deleteTeacher(@PathVariable int id){
        teacherManager.deleteTeacher(id);
    }
}
