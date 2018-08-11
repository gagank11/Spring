package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);
		
		BinarySearchImpl binarySearchImpl=applicationContext.getBean(BinarySearchImpl.class);
	int result = 	binarySearchImpl.binarySearch(new int[] {12,4,5,7,8},3);  
		 
		System.out.println(result);
	
	}
}
  