package com.largestelement.www;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = 0;
		
		int [] numbers = {1 , 2, 3, 4};
		
		
		for (int i = 0; i < numbers.length; i++) {
			//System.out.println(numbers[i]);
			
			if (numbers[i] > max) {
				
				max = numbers[i];
			}
		}
		
		System.out.println(max);
		
	}

}
