package com.mockito.test.testmockito.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mockito.test.testmockito.entity.SampleEn;
import com.mockito.test.testmockito.repository.SampleRepo;

@Service
public class SampleService {
	@Autowired
	private SampleRepo smRepo;

	public SampleEn createCall(SampleEn smEn) {
//		if(smEn.getSampleId() == null) {
//			smEn = smRepo.save(smEn);
//			return smEn;
//		}else {
//			Optional<SampleEn> smOp = smRepo.findBySampleId(smEn.getSampleId());
//			
//			if(smOp.isPresent()) {
//				SampleEn smEn2 = smOp.get();
//				smEn2.setSampleId(smEn.getSampleId());
//				smEn2.setName(smEn.getName());
//				smEn2.setEmail(smEn.getEmail());
//				
//				smEn2 = smRepo.save(smEn2);
//				return smEn2;
//			}
////			}else {
////				return null;
////			}
			return smRepo.save(smEn);
	
}

	public List<SampleEn> getAllData() {
		List<SampleEn> list = new ArrayList<SampleEn>();
		SampleEn smOne = new SampleEn("101","Raj","Raj12@gmail.com");
		SampleEn smTwo = new SampleEn("102","Suraj","Suraj12@gmail.com");
		SampleEn smThree = new SampleEn("103","Kiran","Kiran12@gmail.com");
		
		list.add(smOne);
		list.add(smTwo);
		list.add(smThree);
		list = (List<SampleEn>) smRepo.findAll();
		return list;
		
		
	}
}
