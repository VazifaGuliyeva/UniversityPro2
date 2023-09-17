package com.example.universitypro.dto;

import com.example.universitypro.entity.Teacher;
import org.springframework.stereotype.Component;

import java.util.function.Function;
@Component
public class TeacherDtoManager implements Function<Teacher,TeacherDto> {
    @Override
    public TeacherDto apply(Teacher teacher) {
        return new TeacherDto(teacher.getFullName(),teacher.getSchoolName(),teacher.getLesson());
    }
}
