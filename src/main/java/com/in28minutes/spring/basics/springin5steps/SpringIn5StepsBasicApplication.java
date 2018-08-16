package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;



@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		
		BinarySearchImpl binarySearchImpl=applicationContext.getBean(BinarySearchImpl.class);

		BinarySearchImpl binarySearchImpl1=applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearchImpl);
		System.out.println(binarySearchImpl1);
	

	int result = binarySearchImpl.binarySearch(new int[] {12,4,5,7,8},3);  
		 
		System.out.println(result);
	
	}
}
  