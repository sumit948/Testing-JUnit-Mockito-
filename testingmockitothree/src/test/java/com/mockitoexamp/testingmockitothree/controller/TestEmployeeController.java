package com.mockitoexamp.testingmockitothree.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import com.mockitoexamp.testingmockitothree.entity.Employee;
import com.mockitoexamp.testingmockitothree.service.EmployeeService;
@RunWith(MockitoJUnitRunner.class)
public class TestEmployeeController {
	@Mock
	private EmployeeService empServ;
	
	@InjectMocks
	private EmployeeController empController;
	
	@Test
	public void testGetCall() {
		EmployeeService empServ = mock(EmployeeService.class);
		List<Employee> emp = new ArrayList<Employee>();
		
		Employee emp1 = new Employee();
		emp1.setEmployeeName("Rajnandini P");
		emp1.setIsAvailbale(false);
		
		Employee emp2 = new Employee();
		emp1.setEmployeeName("Raj P");
		emp1.setIsAvailbale(true);
		
		emp.add(emp1);
		emp.add(emp2);
		
		when(empServ.getCall()).thenReturn(emp);
		
		List<Employee> emList = empServ.getCall();
		
		assertEquals(2, emList.size());
	}
	
	@Test
	public void testCreateCall() {
		EmployeeService empServ = mock(EmployeeService.class);
		Employee emp = new Employee();
		emp.setEmployeeName("Raj P");
		emp.setIsAvailbale(true);
		
		when(empServ.createCall(emp)).thenReturn(emp);
		
		//List<Employee> emList = empServ.getCall();
		assertEquals(emp, empServ.createCall(emp) );
	}
	
	@Test
	public void testDeleteCall() {
		EmployeeService empServ = mock(EmployeeService.class);
		Employee emp = new Employee();
		when(empServ.deleteCall(emp)).thenReturn("Employee Deleted!!");
		
		String Result = empServ.deleteCall(emp);
		assertEquals("Employee Deleted!!", Result);
	}
	
	@Test
	public void testPutCall() {
		EmployeeService empServ = mock(EmployeeService.class);
		Employee emp = new Employee();
		emp.setEmployeeId((long) 4);
		emp.setEmployeeName("Raj Patil");
		emp.setIsAvailbale(false);
		
		when(empServ.updateCall(emp)).thenReturn(emp);
		
		assertEquals(emp, empServ.updateCall(emp));
	}
}
