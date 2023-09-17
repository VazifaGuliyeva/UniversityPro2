package com.example.universitypro.exception;

public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String studentIsNotFound) {
        super(studentIsNotFound);
    }
}
