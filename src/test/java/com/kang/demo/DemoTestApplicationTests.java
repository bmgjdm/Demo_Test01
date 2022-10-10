package com.kang.demo;

import com.kang.demo.domain.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoTestApplicationTests {

	@Autowired
	private Person person;


	@Test
	void contextLoads() {
		System.out.print(person);
	}

}
