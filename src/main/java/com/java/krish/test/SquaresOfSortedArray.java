package com.java.krish.test;

import java.util.Arrays;

public class SquaresOfSortedArray {

	public static void main(String[] args) {
		int[] numbers = { -4, -1, 0, 3, 10 };
		int[] result = squaresOfSortedArray(numbers);
		System.out.println(Arrays.toString(result));
	}

	public static int[] squaresOfSortedArray(int[] numbers) {
		int[] result = new int[numbers.length];
		int n = numbers.length;
		int left = 0;
		int right = n - 1;

		for (int i = n - 1; i >= 0; i--) {
			if (Math.abs(numbers[left]) > Math.abs(numbers[right])) {
				result[i] = numbers[left] * numbers[left];
				left++;
			} else {
				result[i] = numbers[right] * numbers[right];
				right--;
			}
		}
		return result;
	}

}
