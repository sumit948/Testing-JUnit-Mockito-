package com.testmockito.testJUnitMockito.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.testmockito.testJUnitMockito.dto.StudentDTO;

@Service
public class StudentService {
	public List<StudentDTO> getStudents() {
        List<StudentDTO> students = new ArrayList<>();
        StudentDTO student = new StudentDTO();
        students.add(student);
        return students;
    }
 
    public StudentDTO saveStudent(StudentDTO student) {
        student.setStudentId(1);;
        student.setStudentName("Arun");;
        return student;
    }
 
    public StudentDTO updateStudent(StudentDTO student) {
        student.setStudentId(2);;
        student.setStudentName("John");;
        return student;
    }
 
    public String deleteStudent(String studentId) {
        return "Student is deleted";
    }
}
