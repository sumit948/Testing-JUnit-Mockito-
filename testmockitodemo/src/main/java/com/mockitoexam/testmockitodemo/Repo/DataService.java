package com.mockitoexam.testmockitodemo.Repo;

import org.springframework.stereotype.Repository;

@Repository
public class DataService {
	public int[] retriveAllData() {
		//dummy data
		return new int[] {1,2,3,4,5};
	}

	public int[] sumOfAll() {
		return new int[] {10,20};
	}
}
