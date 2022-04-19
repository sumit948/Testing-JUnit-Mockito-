package com.testingmockitojunit.testingjunitmockitofive.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.testingmockitojunit.testingjunitmockitofive.dto.BankUserDTO;
import com.testingmockitojunit.testingjunitmockitofive.mapper.BankUserMappper;
import com.testingmockitojunit.testingjunitmockitofive.service.BankUserService;

@RestController
public class BankUserController {
	@Autowired
	private BankUserService bankuserServ;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private BankUserMappper buserMapper;
	
	@PostMapping("/create-user")
	private BankUserDTO createCall(@RequestBody BankUserDTO buserDTO) {
		return bankuserServ.createUser(buserDTO);
	}
	
	@PostMapping("createcall-code")
	private ResponseEntity<BankUserDTO> createCallUsingCode(@RequestBody BankUserDTO buserDTO){
		bankuserServ.createCallUsingCode(buserDTO);
		return new ResponseEntity<BankUserDTO>(HttpStatus.OK);
	}
	
}
