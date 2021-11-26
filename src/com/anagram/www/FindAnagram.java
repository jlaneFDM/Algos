package com.anagram.www;

import java.util.Arrays;

public class FindAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findAnagram("pots", "stop"));

	}
    
	public static boolean findAnagram(String a, String b) {
	    
		char [] firstArray = a.toCharArray();
		char [] secondArray = b.toCharArray();
		
		Arrays.sort(firstArray);
		Arrays.sort(secondArray);
				
		
		if (Arrays.equals(firstArray, secondArray)) {
			return true;
		}
				
		return false;
	} 
}
