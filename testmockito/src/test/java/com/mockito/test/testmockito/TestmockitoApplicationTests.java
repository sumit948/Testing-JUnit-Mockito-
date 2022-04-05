package com.mockito.test.testmockito;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.mockito.test.testmockito.controller.SampleController;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class TestmockitoApplicationTests {

	@Autowired
	SampleController smCon;
	
	@Test
	public void contextLoads() {
		Assertions.assertThat(smCon).isNot(null);
	}
}
