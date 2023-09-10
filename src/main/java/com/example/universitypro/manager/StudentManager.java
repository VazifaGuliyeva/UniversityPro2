package com.example.universitypro.manager;

import com.example.universitypro.entity.Student;
import com.example.universitypro.service.StudentService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class StudentManager implements StudentService {

    private static List<Student> lists=new ArrayList<>();

    static {
        lists.add(new Student(1,"Vazifa Guliyeva",20,"695.20"));
        lists.add(new Student(2,"Gamar Agazada",19,"685.21"));
        lists.add(new Student(3,"Aysu Aliyeva",21,"675.19"));

    }
    @Override
    public List<Student> getAll() {
        return lists;
    }

    @Override
    public Student getId(int id) {
        return lists.get(id-1);
    }

    @Override
    public void saveUser(Student student) {
        lists.add(student);

    }

    @Override
    public void deleteStudent(int id) {
        lists.remove(id-1);

    }
}
