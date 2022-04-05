package com.mockitoexamp.testingmockitothree.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mockitoexamp.testingmockitothree.entity.Employee;
import com.mockitoexamp.testingmockitothree.repository.EmployeeRepo;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepo empRepo;

	public Employee createCall(Employee emp) {
		return empRepo.save(emp);
	}

	public List<Employee> getCall() {
		return empRepo.findAll();
	}

	public String deleteCall(Employee emp) {
		empRepo.delete(emp);
		return "Employee Deleted";
	}

	

	public Employee updateCall(Employee sf) {
		return empRepo.save(sf);
	}
	

}
