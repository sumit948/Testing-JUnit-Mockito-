package com.junittestingexam.testjunitmockitofour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junittestingexam.testjunitmockitofour.dto.CustomerDTO;
import com.junittestingexam.testjunitmockitofour.entity.Customer;
import com.junittestingexam.testjunitmockitofour.service.CustomerService;
import com.junittestingexam.testjunitmockitofour.utils.Message;
import com.junittestingexam.testjunitmockitofour.utils.ResponseBody;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerService custServ;

	@Autowired
	private Message message;
//	@PostMapping("/create-customer")
//	public Customer createCall(@RequestBody Customer cust) {
//		return custServ.createCall(cust);
//	}
	
	@PostMapping("/create-customer")
	public ResponseEntity<ResponseBody> createCustomer(@RequestBody CustomerDTO custDTO){
		custServ.createCustomer(custDTO);
		return ResponseEntity.ok().body(new ResponseBody(HttpStatus.OK.value(), message.getMessage("customer.add")));
	}
	
	@PutMapping("/putCall")
	public Customer putCall(@RequestBody Customer cust) {
		return custServ.putCall(cust);
	}
	
	@GetMapping("/getCall")
	public List<Customer> getCall(){
		return custServ.getCall();
	}

	@DeleteMapping("/deleteCall")
	public String deleteCall(@RequestBody Customer cust) {
		custServ.deleteCall(cust);
		return "Deleted!";
	}
	
}
