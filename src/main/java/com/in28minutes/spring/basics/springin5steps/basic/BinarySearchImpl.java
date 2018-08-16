package com.in28minutes.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	
	@Autowired 
	@Qualifier("bubble")
	private SortAlgorithm sortalgorithm; 



	public int binarySearch(int[] numbers,int numberToSearchFor) {
		
		int[] sortedNumbers= sortalgorithm.sort(numbers);
		 System.out.println(sortalgorithm);
	
		
		return 3; 
	}

	
	
	
}
