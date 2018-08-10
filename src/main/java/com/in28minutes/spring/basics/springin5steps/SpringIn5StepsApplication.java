package com.in28minutes.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
		
		BinarySearchImpl binarysearch = new BinarySearchImpl();
		
		binarysearch.binarySearch(new int[] {12,4,5,7,8},3); 
		
		
		SpringApplication.run(SpringIn5StepsApplication.class, args);
	}
}
  