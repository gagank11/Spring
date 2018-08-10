package com.in28minutes.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	
	@Autowired
	private SortAlgorithm sortalgorithm; 
	
	
	public BinarySearchImpl(SortAlgorithm sortalgorithm) {
		super();
		this.sortalgorithm = sortalgorithm;
	}


	public int binarySearch(int[] numbers,int numberToSearchFor) {
		
	//now we can comment out the line below s we are refering to the interface reference type 
		//--->BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		
		int[] sortedNumbers= sortalgorithm.sort(numbers);
		 System.out.println(sortalgorithm);
	
		// to perform binary search array must be sorted so it's tightly coupled by bubblesort logic here 
		// but if we need to change the the code here 
	    //Sorting an array 
	   //search the array
      //Return the result
		return 3; // dummy
	}
	
	
}
