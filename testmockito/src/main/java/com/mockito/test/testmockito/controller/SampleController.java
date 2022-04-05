package com.mockito.test.testmockito.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mockito.test.testmockito.entity.SampleEn;
import com.mockito.test.testmockito.repository.SampleRepo;
import com.mockito.test.testmockito.service.SampleService;

@RestController
public class SampleController {
	@Autowired
	private SampleService smServ;
	
	@PostMapping("/createCall")
	public SampleEn createCall(@RequestBody SampleEn smEn) {
		return smServ.createCall(smEn);
	}
	
	@GetMapping("/get-all-data")
	public List<SampleEn> getAllData(){
		return smServ.getAllData();
	}
}
