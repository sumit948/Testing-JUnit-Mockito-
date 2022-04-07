package com.junittestingexam.testjunitmockitofour.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junittestingexam.testjunitmockitofour.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long> {

}
