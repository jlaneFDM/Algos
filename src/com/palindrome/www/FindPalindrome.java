package com.palindrome.www;

public class FindPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(evaluateString("aba"));
		
		System.out.println(evaluateString("abab"));
	}
	
	private static boolean evaluateString(String text) {
	    
		StringBuilder sb = new StringBuilder();
		
		String forRerversal = text;
		
		sb.append(forRerversal);
		
				
		String reversedString = sb.reverse().toString();
		
		if (text.equals(reversedString)) {
			return true;
		}
		
		return false;
	}

}
