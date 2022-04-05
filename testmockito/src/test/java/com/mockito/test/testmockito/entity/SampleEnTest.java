package com.mockito.test.testmockito.entity;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.mockito.test.testmockito.repository.SampleRepo;
import com.mockito.test.testmockito.service.SampleService;

@RunWith(MockitoJUnitRunner.class)
public class SampleEnTest {
	
//	@InjectMocks
//	SampleService smServ;
//	
//	@Mock
//	SampleRepo smRepo;
	
	
	@Test
	void testgetAllData() {
		SampleService smServ = mock(SampleService.class);
		List<SampleEn> list = new ArrayList<SampleEn>();
		SampleEn smOne = new SampleEn("101","Raj","Raj12@gmail.com");
		SampleEn smTwo = new SampleEn("102","Suraj","Suraj12@gmail.com");
		SampleEn smThree = new SampleEn("103","Kiran","Kiran12@gmail.com");
		
		list.add(smOne);
		list.add(smTwo);
		list.add(smThree);
		
		when(smServ.getAllData()).thenReturn(list); //stubing the mock to return specific data
		
		//test
		List<SampleEn> smList = smServ.getAllData();
		
		assertEquals(3, smList.size());
//		verify(smServ, times(1)).getAllData();
	}
	
	@Test
	void sampletest() {
		assertEquals(10, 10);
	}
}
