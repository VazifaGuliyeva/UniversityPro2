package com.example.universitypro.controller;

import com.example.universitypro.dto.StudentDto;
import com.example.universitypro.entity.Student;
import com.example.universitypro.manager.StudentManager;
import org.springframework.http.HttpStatus;
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
    public List<StudentDto> getAll(){
      return  studentManager.getAll();
    }
    @GetMapping("/students/{id}")
    public StudentDto getId(@PathVariable int id){
        return studentManager.getId(id);
    }
    @PostMapping("/students")
    @ResponseStatus(code = HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student){
        studentManager.saveUser(student);
    }
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable int id){
        studentManager.deleteStudent(id);
    }

}
