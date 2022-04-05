package com.testmockito.testJUnitMockito.controllertest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.testmockito.testJUnitMockito.dto.StudentDTO;
import com.testmockito.testJUnitMockito.service.StudentService;

@WebMvcTest
public class StudentControllerTest {
	
	@Autowired
    private MockMvc mockMvc;
 
    @MockBean
    private StudentService studentService;
 
    private static ObjectMapper mapper = new ObjectMapper();
 
    @Test
    public void testGetExample() throws Exception {
        List<StudentDTO> students = new ArrayList<>();
        StudentDTO student = new StudentDTO();
        student.setStudentId(1);;
        student.setStudentName("Arun");;
        students.add(student);
        Mockito.when(studentService.getStudents()).thenReturn(students);
        mockMvc.perform(get("/getMapping")).andExpect(status().isOk()).andExpect(jsonPath("$", Matchers.hasSize(1)))
                .andExpect(jsonPath("$[0].studentName", Matchers.equalTo("Arun")));
    }
    
    @Test
	  public void testPostExample() throws Exception {
	  	StudentDTO student = new StudentDTO();
	      student.setStudentId(1);;
	      student.setStudentName("Arun");;
	      Mockito.when(studentService.saveStudent(ArgumentMatchers.any())).thenReturn(student);
	      String json = mapper.writeValueAsString(student);
	      mockMvc.perform(post("/postMapping").contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")
	              .content(json).accept(MediaType.APPLICATION_JSON)).andExpect(status().isCreated())
	              .andExpect(jsonPath("$.studentId", Matchers.equalTo(1)))
	              .andExpect(jsonPath("$.studentName", Matchers.equalTo("Arun")));
	  }
    
  @Test
  public void testPutExample() throws Exception {
  	StudentDTO student = new StudentDTO();
      student.setStudentId(2);;
      student.setStudentName("John");;
      Mockito.when(studentService.updateStudent(ArgumentMatchers.any())).thenReturn(student);
      String json = mapper.writeValueAsString(student);
      mockMvc.perform(put("/putMapping").contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")
              .content(json).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
              .andExpect(jsonPath("$.studentId", Matchers.equalTo(2)))
              .andExpect(jsonPath("$.studentName", Matchers.equalTo("John")));
  }
  
@Test
public void testDeleteExample() throws Exception {
    Mockito.when(studentService.deleteStudent(ArgumentMatchers.anyString())).thenReturn("Student is deleted");
    MvcResult requestResult = mockMvc.perform(delete("/deleteMapping").param("student-id", "1"))
            .andExpect(status().isOk()).andExpect(status().isOk()).andReturn();
    String result = requestResult.getResponse().getContentAsString();
    assertEquals(result, "Student is deleted");

}

private void assertEquals(String result, String string) {
	// TODO Auto-generated method stub
	
}
}
