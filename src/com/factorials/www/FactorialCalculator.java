package com.factorials.www;

public class FactorialCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   System.out.println(factorialize(5));	;
	}
	
	public static int factorialize(int userInput) {
		int result = 1;
		for(int i = userInput; i > 0; i--) {
			System.out.println(i);
			
			result *= i; 
		}
		
		return result;
	}

}
