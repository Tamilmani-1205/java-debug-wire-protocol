package com.example.student.service.impl;

import com.example.student.dto.StudentDto;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class StudentServiceImplTest {

    @Mock
    StudentServiceImpl studentService;

    StudentDto studentDto;

    @BeforeAll
    void setUp() {
        studentDto = new StudentDto(3, "Test", "11ABC22", "9898989898", "MALE", "SNHSS", 1, 1, LocalDateTime.now(), 1, LocalDateTime.now());
    }

    @Test
    void addStudent() {
        studentService.addStudent(studentDto);
    }

}