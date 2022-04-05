package com.mockitoexam.testmockitodemo.Serv;

import org.springframework.stereotype.Service;

import com.mockitoexam.testmockitodemo.Repo.DataService;

@Service
public class BusinessService {
	private DataService dataService;

	public BusinessService(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public int findMaximum() {
		int[] data= dataService.retriveAllData();
		int max = Integer.MIN_VALUE;
		
		for(int value : data) {
			if(value>max) {
				max = value;
			}
		}
		return max;
	}
	
	public String checkName() {
		return "rajveer";
	}
	
	public int SumOfArray() {
		int[] arr = dataService.sumOfAll();
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}
