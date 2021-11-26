package com.fibsequence.www;

import java.util.Arrays;

public class FiboFinder {

	public static void main(String[] args) {
		findFibSeq(10);
	}

	public static void findFibSeq(int number) {

		int[] fibSequence = new int[number];

		for (int i = 0; i < fibSequence.length; i++) {

			if (i == 0) {
				fibSequence[i] = 0;
			} else if (i == 1) {
				fibSequence[i] = 1;
			} else {
				fibSequence[i] = fibSequence[i - 1] + fibSequence[i - 2];
			}
		}
		System.out.println(Arrays.toString(fibSequence));
	}
}
