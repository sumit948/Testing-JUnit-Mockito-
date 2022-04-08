package com.junittestingexam.testjunitmockitofour.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junittestingexam.testjunitmockitofour.dto.CustomerDTO;
import com.junittestingexam.testjunitmockitofour.entity.Customer;
import com.junittestingexam.testjunitmockitofour.mapper.CustomerMapper;
import com.junittestingexam.testjunitmockitofour.repository.CustomerRepo;
import com.junittestingexam.testjunitmockitofour.utils.Message;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepo custRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private CustomerMapper customerMapper;
	
	@Autowired
	private Message message;

//	public Customer createCall(Customer cust) {
//		return custRepo.save(cust);
//	}

	/**
	 * 
	 * @param cust
	 * @return
	 */
	public Customer putCall(Customer cust) {
		return custRepo.save(cust);
	}

	/**
	 * 
	 * @return
	 */
	public List<Customer> getCall() {
		return custRepo.findAll();
	}


	/**
	 * 
	 * @param cust
	 */
	public void deleteCall(Customer cust) {
		custRepo.delete(cust);
	}

	/**
	 * 
	 * @param custDTO
	 */
	public void createCustomer(CustomerDTO custDTO) {
		Customer customer = customerMapper.toCustomerEntity(custDTO);
		
		customer = custRepo.save(customer);
				
	}

	public void updateCustomer(CustomerDTO custDTO) {
		Customer customer = customerMapper.toCustomerEntity(custDTO);
		
		customer = custRepo.save(customer);
	}

	public List<CustomerDTO> getALLCustomers() {
		List<Customer> list = (List<Customer>) custRepo.findAll();
		return list.stream().map(e->customerMapper.toCustomerDTO(e)).collect(Collectors.toList());
	}

	public void deleteCustomerBasedOnId(Long customerId) {
		Optional<Customer> customer = custRepo.findByCustomerId(customerId);
		if(!customer.isPresent())
			custRepo.deleteByCustomerId(customerId);
			
	}
	
}
