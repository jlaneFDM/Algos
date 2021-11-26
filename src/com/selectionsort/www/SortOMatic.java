package com.selectionsort.www;

import java.util.Arrays;

public class SortOMatic {

	public static void main(String[] args) {
		int[] unsorted = { 14, 33, 27, 10, 35, 19, 42, 44 };
		// int[] unsorted = { 5,1,4,2,3 };

		System.out.println("Result: " + sort(unsorted));

	}

	public static String sort(int[] arr) {
		// real world implementation
		// Arrays.sort(unsorted);

		// reinvent the wheel implementation:

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					
					var memo = arr[i];
					arr[i] = arr[j];
					arr[j] = memo;
				}
			}
		}

		return Arrays.toString(arr);
	}

}
