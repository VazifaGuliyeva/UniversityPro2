package com.example.universitypro.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="students")
public class Student {
    @Id
    private Integer id;
    @Column(name="fullname")
    private String fullName;
    @Column(name="age")
    private int age;
    @Column(name="classnumber")
    private String classNumber;

   @ManyToMany
    @JoinTable(name="teacher",
            joinColumns=@JoinColumn(name="student_id"),
            inverseJoinColumns=@JoinColumn(name="teacher_id"))
    List<Teacher> teachers;

/*
* {
"id": 7,
"fullName": "Ali Valiyev",
"age": 21,
"classNumber":"695",
 "teachers":[{"id":3}]
}----> post sorgusunun gonderilmesi*/

}
