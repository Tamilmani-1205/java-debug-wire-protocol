package com.example.student.service;

import com.example.student.dto.StudentDto;
import com.example.student.model.Student;

import java.util.List;

public interface StudentService {

    StudentDto addStudent(StudentDto studentDto);

    StudentDto getStudentById(long id);

    List<StudentDto> getAllStudentsByName(String name);

    List<StudentDto> getAllStudent();

    void updateById(long id, StudentDto studentDto);

    void deleteById(long id);

    Student findById(long id);
}
