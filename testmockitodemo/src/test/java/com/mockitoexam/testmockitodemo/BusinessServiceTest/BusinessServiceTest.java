package com.mockitoexam.testmockitodemo.BusinessServiceTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.mockitoexam.testmockitodemo.Repo.DataService;
import com.mockitoexam.testmockitodemo.Serv.BusinessService;

@RunWith(MockitoJUnitRunner.class)
public class BusinessServiceTest {
	
	@Mock
	DataService dataServ;
	
	@InjectMocks
	BusinessService businessServ;
	
	@Test
	public void testMaxNumber() {
		DataService dataServ = mock(DataService.class);
		when(dataServ.retriveAllData()).thenReturn(new int[] {24,2,5});
		BusinessService businessServ = new BusinessService(dataServ);
		int result = businessServ.findMaximum();
		assertEquals(24, result);
	}
	
//	@Test
//	public void testfindmax() {
//		DataService dataServ = mock(DataService.class);
//		when(dataServ.retriveAllData()).thenReturn(new int[] {24,2,5}); //stubing return class
//		BusinessService businessServ = new BusinessService(dataServ);
//		int result = businessServ.findMaximum();
//		assertEquals(24,result);
//	}
//	
//	@Test
//	public void testCheckName() {
//		BusinessService bServ = mock(BusinessService.class);
//		when(bServ.checkName()).thenReturn("Sumit");
//		String result = bServ.checkName();
//		assertEquals("Sumit",result);
//	}
	
	@Test
	public void testSumOfArray() {
		DataService dataServ = mock(DataService.class);
		when(dataServ.sumOfAll()).thenReturn(new int[] {2,3});
		BusinessService bServ = new BusinessService(dataServ);
		int result = bServ.SumOfArray();
		assertEquals(5,result);
		
		
	}
}
