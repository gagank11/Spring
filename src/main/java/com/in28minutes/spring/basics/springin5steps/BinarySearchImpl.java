package com.in28minutes.spring.basics.springin5steps;

public class BinarySearchImpl {
		
	
	public int binarySearch(int[] numbers,int numberToSearchFor) {
		
		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers= bubbleSortAlgorithm.sort(numbers);
		 
	
		// to perform binary search array must be sorted so it's tightly coupled by bubblesort logic here 
		// but if we need to change the the code here 
	    //Sorting an array 
	   //search the array
      //Return the result
		return 3; // dummy
	}
	
	
}
