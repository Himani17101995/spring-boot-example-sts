package com.himani.spring_boot_example_sts;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.himani.spring_boot_example_sts.service.Service;

@RunWith(SpringRunner.class)
@SpringBootTest
class AppTest {

	@Autowired
	ApplicationContext context;
	@Test
	void testService() {
		Service service = context.getBean(Service.class);
		
		service.save();
	}

}