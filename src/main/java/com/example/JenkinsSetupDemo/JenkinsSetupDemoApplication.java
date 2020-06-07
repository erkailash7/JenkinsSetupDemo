package com.example.JenkinsSetupDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;


@SpringBootApplication
public class JenkinsSetupDemoApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsSetupDemoApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application started........1");
	}



	public static void main(String[] args) {
		logger.info("Application executed.......")
		SpringApplication.run(JenkinsSetupDemoApplication.class, args);
	}

}
