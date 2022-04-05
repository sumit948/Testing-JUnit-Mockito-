package com.mockitoexamp.testingmockitothree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mockitoexamp.testingmockitothree.entity.Employee;
import com.mockitoexamp.testingmockitothree.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService empServ;
	
	@PostMapping("/createCall")
	private Employee createCall(@RequestBody Employee emp){
		return empServ.createCall(emp);
	}
	
	@GetMapping("/getCall")
	private  List<Employee> getCall(){
		return empServ.getCall();
	}
	
	@DeleteMapping("/deleteCall")
	private String deleteCall(@RequestBody Employee emp) {
		return empServ.deleteCall(emp);
	}
	
	
	@PutMapping("/update")
	private Employee updateCall(@RequestBody Employee emp) {
		return empServ.updateCall(emp);
	}
	
	
}
