package com.mockitoexamp.testingmockitothree.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mockitoexamp.testingmockitothree.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {


}
