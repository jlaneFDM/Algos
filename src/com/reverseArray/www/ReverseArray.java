package com.reverseArray.www;

public class ReverseArray {

	public static void main(String[] args) {
		
		int [] numbers = { 1, 2, 3, 4, 5 };
		int [] reversed = new int[numbers.length];
		
		for (int i = numbers.length -1; i >= 0; i--) {
			reversed[i] = numbers[i];
			System.out.print(reversed[i] + " ");
		}
							
	}

}
