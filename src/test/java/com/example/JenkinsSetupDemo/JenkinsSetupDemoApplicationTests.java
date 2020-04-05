package com.example.JenkinsSetupDemo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class JenkinsSetupDemoApplicationTests {

	Logger logger = LoggerFactory.getLogger(JenkinsSetupDemoApplicationTests.class);

	@Test
	public void contextLoads() {
		logger.info("Test case execution started.....................");
		
		Assert.assertEquals(true, true);
	}

}
