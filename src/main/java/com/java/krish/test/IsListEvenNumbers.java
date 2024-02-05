package com.java.krish.test;

import java.util.List;

public class IsListEvenNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
		if (isAllEvenNumbers(numbers)) {
			System.out.println("All numbers are even!");
		} else {
			System.out.println("All numbers are not even!");
		}

		List<Integer> numbers1 = List.of(4, 2, 12, 46, 52, 68);
		if (isAllEvenNumbers(numbers1)) {
			System.out.println("All numbers are even!");
		} else {
			System.out.println("All numbers are not even!");
		}
	}

	// Is list contains all even numbers
	public static boolean isAllEvenNumbers(List<Integer> numbers) {
//		return numbers.stream().allMatch(number -> number % 2 == 0);
		return !numbers.stream().anyMatch(number -> number % 2 != 0);
	}

}
