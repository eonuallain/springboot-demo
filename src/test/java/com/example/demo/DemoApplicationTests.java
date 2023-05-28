package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.concurrent.TimeUnit;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void dummyTest() {
		System.out.println("sleeping for 5 minutes");
		TimeUnit.MINUTES.sleep(5);
		assert(1 == 1);
	}
}
