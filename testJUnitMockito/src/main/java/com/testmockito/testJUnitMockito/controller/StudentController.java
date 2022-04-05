package com.testmockito.testJUnitMockito.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testmockito.testJUnitMockito.dto.StudentDTO;
import com.testmockito.testJUnitMockito.service.StudentService;

@RestController
public class StudentController {
	 @Autowired
	    private StudentService studentService;
	     
	    @GetMapping("/getMapping")
	    public ResponseEntity<List<StudentDTO>> getStudents() {
	        List<StudentDTO> students = studentService.getStudents();
	        return new ResponseEntity<>(students, HttpStatus.OK);
	    }
	 
	    @PostMapping("/postMapping")
	    public ResponseEntity<StudentDTO> saveStudent(@RequestBody StudentDTO student) {
	        student = studentService.saveStudent(student);
	        return new ResponseEntity<>(student, HttpStatus.CREATED);
	    }
	 
	    @PutMapping("/putMapping")
	    public ResponseEntity<StudentDTO> putExample(@RequestBody StudentDTO student) {
	        student = studentService.updateStudent(student);
	        return new ResponseEntity<>(student, HttpStatus.OK);
	    }
	 
	    @DeleteMapping("/deleteMapping")
	    public ResponseEntity<String> deleteExample(@RequestParam("student-id") String studentId) {
	        String response = studentService.deleteStudent(studentId);
	        return new ResponseEntity<>(response, HttpStatus.OK);
	    }
}
