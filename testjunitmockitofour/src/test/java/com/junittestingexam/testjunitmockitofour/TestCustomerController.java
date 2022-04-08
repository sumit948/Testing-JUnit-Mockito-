package com.junittestingexam.testjunitmockitofour;


import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import com.junittestingexam.testjunitmockitofour.controller.CustomerController;
import com.junittestingexam.testjunitmockitofour.dto.CustomerDTO;
import com.junittestingexam.testjunitmockitofour.entity.Customer;
import com.junittestingexam.testjunitmockitofour.service.CustomerService;

@RunWith(MockitoJUnitRunner.class)
public class TestCustomerController {
	@InjectMocks
	private CustomerController custController;
	
	@Mock
	private CustomerService custServ;
	
	@Autowired
	private MockMvc mockMvc;
	
//	@Test
//	public void testGetCall() {
//		CustomerService custServ = mock(CustomerService.class);
//		CustomerDTO c1 = new CustomerDTO();
//		c1.setCustomerId(101L);
//		c1.setCustomerName("Raj Patil");
//		c1.setCustomerEmail("raj123@gmail.com");
//		
//		List<CustomerDTO> c2 = new ArrayList<CustomerDTO>();
//		c2.add(c1);
//		
//		mockMvc.perform(create("/customer/create-customer"))
//		
//				.andExpect(status().isOk())
////        .andExpect(jsonPath("$[0].customerId", is(101L)))
////        .andExpect(jsonPath("$[0].customerName", is("Raj Patil")))
////        .andExpect(jsonPath("$[0].customerEmail", is("raj22@gmail.com")))
//
////
////verify(todoServiceMock, times(1)).findAll();
////verifyNoMoreInteractions(todoServiceMock);
//		
//		
//	}
}
