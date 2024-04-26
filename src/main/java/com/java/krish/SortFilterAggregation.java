package com.java.krish.tesco;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortFilterAggregation {

	public static void main(String[] args) {
		// Sample data
        List<String> strings = Arrays.asList("apple", "banana", "orange", "grape", "pineapple");
        System.out.println("Original list: " + strings);
        // Custom sorting
        List<String> sortedList = strings.stream()
                .sorted((s1, s2) -> s1.compareTo(s2)) // Sort alphabetically
                .collect(Collectors.toList());
        System.out.println("Sorted list: " + sortedList);

        // Custom filtering
        List<String> filteredList = strings.stream()
                .filter(s -> s.startsWith("a")) // Filter strings starting with 'a'
                .collect(Collectors.toList());
        System.out.println("Filtered list: " + filteredList);

        // Custom aggregation
        String aggregatedString = strings.stream()
                .reduce((s1, s2) -> s1 + ", " + s2) // Concatenate strings
                .orElse("");
        System.out.println("Aggregated string: " + aggregatedString);
	}

}
