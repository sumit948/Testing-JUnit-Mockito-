package com.junittestingexam.testjunitmockitofour.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.junittestingexam.testjunitmockitofour.entity.Customer;
import com.junittestingexam.testjunitmockitofour.entity.Restrorent;
import com.junittestingexam.testjunitmockitofour.repository.RestrorentRepo;

@Service
public class RestrorentService {

		@Autowired
		private RestrorentRepo restRepo;

		public Restrorent createCall(Restrorent rust) {
			return restRepo.save(rust);
		}

		public Restrorent putCall(Restrorent rust) {
			return restRepo.save(rust);
		}

		public List<Restrorent> getCall() {
			return restRepo.findAll();
		}

		public void deleteCall(Restrorent rust) {
			restRepo.delete(rust);
		}
		
}
