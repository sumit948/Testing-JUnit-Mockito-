package com.junittestingexam.testjunitmockitofour.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.junittestingexam.testjunitmockitofour.entity.Restrorent;

@Repository
public interface RestrorentRepo extends JpaRepository<Restrorent,Long> {

}
