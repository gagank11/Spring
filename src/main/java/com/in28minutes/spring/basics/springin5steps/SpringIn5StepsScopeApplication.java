package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import scope.*;


@SpringBootApplication
@ComponentScan("package scope")
public class SpringIn5StepsScopeApplication {
	
	
	private static Logger LOGGER= LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsScopeApplication.class, args);
		
		PersonDAO person=applicationContext.getBean(PersonDAO.class);

		PersonDAO person1=applicationContext.getBean(PersonDAO.class);
		
	LOGGER.info("{}",person);
	LOGGER.info("{}",person.getJdbcConnection());
	
	LOGGER.info("{}",person1);
	LOGGER.info("{}",person1.getJdbcConnection());
		
	}
}
  