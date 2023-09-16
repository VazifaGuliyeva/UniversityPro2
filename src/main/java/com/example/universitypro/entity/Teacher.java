package com.example.universitypro.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name="teachers")
public class Teacher {
    @Id
    private Integer id;
    @Column(name = "fullname")
    private String fullName;
    @Column(name="schoolname")
    private String schoolName;
    @Column(name="lesson")
    private String lesson;



}
