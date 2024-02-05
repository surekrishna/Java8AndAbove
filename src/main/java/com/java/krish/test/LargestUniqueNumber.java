package com.java.krish.test;

import java.util.HashMap;
import java.util.Map;

public class LargestUniqueNumber {

	public static void main(String[] args) {
		System.out.println(largestUniqueNumber(new int[] {5, 1, 5, 2, 3, 2}));

	}

	public static int largestUniqueNumber(int[] numbers) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		Integer largestUniqueNumber = -1;

		for (int number : numbers) {
			frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			if (entry.getValue() == 1 && entry.getKey() > largestUniqueNumber) {
				largestUniqueNumber = entry.getKey();
			}
		}

		return largestUniqueNumber;
	}

}
