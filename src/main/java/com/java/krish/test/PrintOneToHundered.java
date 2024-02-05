package com.java.krish.test;

import java.util.Arrays;
import java.util.BitSet;
import java.util.stream.IntStream;

public class PrintOneToHundered {

	public static void main(String[] args) {

		int one = 'a' / 'a';
		String stars = "**********";
		int hundered = stars.length() * stars.length();

		System.out.println("*** Without any loop ***");

		// Solution - 1, Print 1 to 100 without using any numbers
		for (int i = one; i <= hundered; i++) {
			System.out.println(i);
		}
		System.out.println("*** Without any loop ***");

		// Solution - 2, Print 1 to 100 without using any numbers
		// a = 97, b = 98, c = 99, d = 100
		for (int i = one; i <= 'd'; i++) {
			System.out.println(i);
		}
		System.out.println("*** Using Recursion ***");

		// Solution - 3, Print 1 to 100 without using any loops
		printNumbersRangeUsingRecursion(one, hundered);

		System.out.println("*** Using Java 8 ***");

		// Solution - 4, Print 1 to 100 without using any loops
		IntStream.range(one, hundered + 1).forEach(System.out::println);
		
		System.out.println("*** Without using any loop and recursion ***");
		
		Object[] nums = new Object[100];
		Arrays.fill(nums, new Object() {
			int count = 1;
			@Override
			public String toString() {
				return Integer.toString(count++);
			}
		});
		
		System.out.println(Arrays.toString(nums));
		
		System.out.println("*** Without using any loop and recursion ***");
		
		String oneToHundered = new BitSet() {{ set(1, 101);}}.toString();
		System.out.println(oneToHundered);
	}

	public static void printNumbersRangeUsingRecursion(int start, int end) {
		if (start <= end) {
			System.out.println(start++);
			printNumbersRangeUsingRecursion(start, end);
		}
	}

}
