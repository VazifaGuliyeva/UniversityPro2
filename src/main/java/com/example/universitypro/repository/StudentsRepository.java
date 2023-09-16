package com.example.universitypro.repository;

import com.example.universitypro.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Student,Integer> {
}
