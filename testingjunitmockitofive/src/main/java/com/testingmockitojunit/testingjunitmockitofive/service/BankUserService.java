package com.testingmockitojunit.testingjunitmockitofive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testingmockitojunit.testingjunitmockitofive.dto.BankUserDTO;
import com.testingmockitojunit.testingjunitmockitofive.entity.BankUser;
import com.testingmockitojunit.testingjunitmockitofive.mapper.BankUserMappper;
import com.testingmockitojunit.testingjunitmockitofive.repository.BankUserRepo;

@Service
public class BankUserService {

	@Autowired
	private BankUserRepo bankuserRepo;
	
	@Autowired
	private BankUserMappper buserMapper;

	public BankUserDTO createUser(BankUserDTO buserDTO) {
		BankUser buser = buserMapper.dtoToEntity(buserDTO);
		
		buser = bankuserRepo.save(buser);
		
		return buserDTO;
	}

	public void createCallUsingCode(BankUserDTO buserDTO) {
		BankUser buser = buserMapper.dtoToEntity(buserDTO);
		
		buser = bankuserRepo.save(buser);
		
		
	}
}
