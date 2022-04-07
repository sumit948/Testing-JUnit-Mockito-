package com.junittestingexam.testjunitmockitofour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.junittestingexam.testjunitmockitofour.entity.Customer;
import com.junittestingexam.testjunitmockitofour.entity.Restrorent;
import com.junittestingexam.testjunitmockitofour.service.RestrorentService;

@RestController
@RequestMapping("/restrorent")
public class RestrotrentController {
	@Autowired
	private RestrorentService restServ;
	
	@PostMapping("/createCall")
	public Restrorent createCall(@RequestBody Restrorent rust) {
		return restServ.createCall(rust);
	}
	
	@PutMapping("/putCall")
	public Restrorent putCall(@RequestBody Restrorent rust) {
		return restServ.putCall(rust);
	}
	
	@GetMapping("/getCall")
	public List<Restrorent> getCall(){
		return restServ.getCall();
	}

	@DeleteMapping("/deleteCall")
	public String deleteCall(@RequestBody Restrorent rust) {
		restServ.deleteCall(rust);
		return "Deleted!";
	}
}
