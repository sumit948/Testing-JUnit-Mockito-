package com.junittestingexam.testjunitmockitofour;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestjunitmockitofourApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestjunitmockitofourApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
