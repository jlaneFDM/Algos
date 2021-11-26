package com.maxelement.www;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxElementFinder {

	public static void main(String[] args) {
		Integer [] elements = {1, 2, 3, 4, 5};
		System.out.println(findMaxElement(elements));
	}
	
	public static int findMaxElement(Integer [] numberArray) {
		
		
		List<Integer> numberList = Arrays.asList(numberArray);
		
		int max = Collections.max(numberList);
		
		return max;
	}

}
