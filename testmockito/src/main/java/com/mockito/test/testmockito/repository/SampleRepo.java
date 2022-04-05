package com.mockito.test.testmockito.repository;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mockito.test.testmockito.entity.SampleEn;


@Repository
public interface SampleRepo extends CrudRepository<SampleEn, String>{

	Optional<SampleEn> findBySampleId(String sampleId);
	
	
}
