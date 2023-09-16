package com.example.universitypro.controller;


import com.example.universitypro.entity.Teacher;
import com.example.universitypro.manager.TeacherManager;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/teachers")
public class TeacherController {
    private final TeacherManager teacherManager;
    @GetMapping
    public List<Teacher> getAll(){
        return teacherManager.getAll();
    }
    @GetMapping("/{id}")
    public Teacher getById(@PathVariable int id){
        return teacherManager.getById(id);
    }
    @PostMapping
    public void saveTeacher(@RequestBody Teacher teacher){
        teacherManager.saveTeacher(teacher);
    }
    @DeleteMapping("{id}")
    public void deleteTeacher(@PathVariable int id){
        teacherManager.deleteTeacher(id);
    }
}
