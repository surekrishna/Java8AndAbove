package com.java.krish.test;

public class MissingNumber {

	public static void main(String[] args) {
		System.out.println(missingNumber(new int[] {0, 1, 3, 4, 5, 6, 7}));
		System.out.println(missingNumber(new int[] {0, 1, 2, 3, 4, 5, 7}));
		System.out.println(missingNumber(new int[] {0, 2, 3, 4, 5, 6, 7}));
		System.out.println(missingNumber(new int[] {0, 1, 2, 3, 4, 6, 7}));
	}

	public static int missingNumber(int[] numbers) {
		int n = numbers.length;
		int expectedSum = (n * (n + 1)) / 2;
		int actualSum = 0;

		for(int number : numbers) {
			actualSum += number;
		}
		
		return expectedSum - actualSum;
	}

}
