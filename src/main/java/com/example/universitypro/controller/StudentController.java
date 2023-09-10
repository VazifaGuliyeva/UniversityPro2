package com.example.universitypro.controller;

import com.example.universitypro.entity.Student;
import com.example.universitypro.manager.StudentManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    private final  StudentManager studentManager;

    public StudentController(StudentManager studentManager) {
        this.studentManager = studentManager;
    }


    @GetMapping("/students")
    public List<Student> getAll(){
      return  studentManager.getAll();
    }
    @GetMapping("/students/{id}")
    public Student getId(@PathVariable int id){
        return studentManager.getId(id);
    }
    @PostMapping("/students")
    public void saveStudent(@RequestBody Student student){
        studentManager.saveUser(student);
    }
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable int id){
        studentManager.deleteStudent(id);
    }

}
