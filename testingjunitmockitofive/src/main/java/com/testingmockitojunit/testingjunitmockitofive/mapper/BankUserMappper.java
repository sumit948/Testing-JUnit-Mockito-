package com.testingmockitojunit.testingjunitmockitofive.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.testingmockitojunit.testingjunitmockitofive.dto.BankUserDTO;
import com.testingmockitojunit.testingjunitmockitofive.entity.BankUser;

@Component
public class BankUserMappper {

	@Autowired
	private ModelMapper modelMapper;
	
	public BankUser dtoToEntity(BankUserDTO buserDTO) {
		return modelMapper.map(buserDTO, BankUser.class);
	}
	
	public BankUserDTO entityToDTO(BankUser bUser) {
		return modelMapper.map(bUser, BankUserDTO.class);
	}
}
