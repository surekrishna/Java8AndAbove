package com.java.krish.test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstCharStartsWith {

	public static void main(String[] args) {
		List<String> values = List.of("Apple", "Banana", "Avocado", "BlackBerry");
		List<String> result = getListStartWith(values, "B");
		System.out.println(result);

		Optional<String> result1 = getListStartWith1(values, "B");
		if (result1.isPresent()) {
			System.out.println(result1.get());
		}
	}

	public static List<String> getListStartWith(List<String> values, String startsWith) {
		return values.stream().filter(value -> value.startsWith(startsWith)).collect(Collectors.toList());
	}

	public static Optional<String> getListStartWith1(List<String> values, String startsWith) {
		return values.stream().filter(value -> value.startsWith(startsWith)).findFirst();
	}
}
