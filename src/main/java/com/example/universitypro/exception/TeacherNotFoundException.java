package com.example.universitypro.exception;

public class TeacherNotFoundException extends RuntimeException {
    public TeacherNotFoundException(String teacherIsNotFound) {
        super(teacherIsNotFound);
    }
}
