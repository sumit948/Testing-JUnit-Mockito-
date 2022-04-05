package com.mockito.test.testmockito.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SampleEn {
	@Id
	private String sampleId;
	
	@Column
	private String name;
	
	private String email;

	
	public SampleEn() {
		super();
	}



	public SampleEn(String sampleId, String name, String email) {
		super();
		this.sampleId = sampleId;
		this.name = name;
		this.email = email;
	}
	
	

	public String getSampleId() {
		return sampleId;
	}



	public void setSampleId(String sampleId) {
		this.sampleId = sampleId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "SampleEn [sampleId=" + sampleId + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
