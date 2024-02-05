package com.java.krish.test;

import java.util.List;

public class LongestStringFromArray {

	public static void main(String[] args) {
		// java program to find longest string from the given array
		List<String> values = List.of("java", "springboot", "hibernate", "microservices");
		int maxLength = values.stream().map(value -> value.length()).mapToInt(i -> i).summaryStatistics().getMax();
		System.out.println(maxLength);

		// convert first half to lower case and second half to upper case
		String value = "This is Java Program This is Java Program";
		int mid = value.length() / 2;

		String result = value.substring(0, mid).toLowerCase() + value.substring(mid).toUpperCase();
		System.out.println(result);

	}

}
