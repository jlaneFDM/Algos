package com.mergesortedarrays.www;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		
		int [] a = { 1, 2, 3 };
		int [] b = { 3, 4, 5 };
		
		Merge(a,b);
	}
	
	private static void Merge(int[] a, int[] b) {
		int firstArrayLength = a.length;
		int secondArrayLength = b.length;
		
		int result [] = new int[firstArrayLength + secondArrayLength];
		
		System.arraycopy(a, 0, result, 0, firstArrayLength);
		System.arraycopy(b, 0, result, firstArrayLength, secondArrayLength);
		
		System.out.println(Arrays.toString(result));
		
	}

}
