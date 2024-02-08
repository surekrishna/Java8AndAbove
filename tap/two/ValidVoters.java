package com.java.krish.tap.two;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * 1) No of Voting is N in a election constituency area 
   and each voter is identifed as a character in the String where the length of the String is N.
   and in the constituency the voters may be duplicated so please identify the duplicate voters in the constituency and print only valid voters.
   N = 6 
   voters aabacd
   Output : abcd.
 */
public class ValidVoters {

	public static void main(String[] args) {
		String voters = "aabacd";
		System.out.println(validVoters(voters));
		System.out.println(validVoters1(voters));
		System.out.println(validVoters2(voters));
	}

	public static String validVoters(String voters) {
		return voters.chars()// returns stream of int (java9)
				.distinct()// returns stream of distinct elements
				.mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());// Concatenate input elements
																						// into string

	}

	public static Set<Character> validVoters1(String voters) {
		Set<Character> validVoters = new HashSet<>();

		for (Character ch : voters.toCharArray()) {
			if (!validVoters.contains(ch)) {
				validVoters.add(ch);
			}
		}

		return validVoters;
	}

	public static String validVoters2(String voters) {
		Set<Character> validVoters = new HashSet<>();

		for (Character ch : voters.toCharArray()) {
			if (!validVoters.contains(ch)) {
				validVoters.add(ch);
			}
		}

		return validVoters.stream().map(String::valueOf).collect(Collectors.joining());
	}
}
