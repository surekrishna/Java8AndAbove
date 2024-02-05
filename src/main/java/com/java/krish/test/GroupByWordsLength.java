package com.java.krish.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByWordsLength {

	public static strictfp void main(String[] args) {
		String input = "i have a sentence with technical words";

		Map<Integer, List<String>> result = Arrays.asList(input.split(" ")).stream()
				.collect(Collectors.groupingBy(String::length));
		System.out.println(result);
	}

}

