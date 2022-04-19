package com.testingmockitojunit.testingjunitmockitofive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testingmockitojunit.testingjunitmockitofive.entity.BankUser;

@Repository
public interface BankUserRepo extends JpaRepository<BankUser, Long> {

}
