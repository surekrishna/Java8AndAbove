package com.java.krish.test;

import java.util.HashMap;
import java.util.Map;

public class AnagramOrNot {

	public static void main(String[] args) {
//		System.out.println(isAnagram("care", "race"));
//		System.out.println(isAnagram("car", "race"));
//		System.out.println(isAnagram("listen", "silent"));
//		System.out.println(isAnagram("rat", "car"));
//		System.out.println(isAnagram("", ""));
//		System.out.println(isAnagram(" ", " "));

		System.out.println(isAnagram1("rat", "car"));
		System.out.println(isAnagram1("care", "race"));
	}

	public static boolean isAnagram(String value1, String value2) {
		boolean isAnagram = true;
		int[] alphabet = new int[26];

		if (value1.length() != value2.length() || value1.trim().length() == 0 || value2.trim().length() == 0) {
			return !isAnagram;
		}

		for (int i = 0; i < value1.length(); i++) {
			alphabet[value1.charAt(i) - 'a']++;
		}

		for (int j = 0; j < value2.length(); j++) {
			alphabet[value2.charAt(j) - 'a']--;
		}

		for (int i : alphabet) {
			if (i != 0) {
				return !isAnagram;
			}
		}

		return isAnagram;
	}

	public static boolean isAnagram1(String value1, String value2) {
		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < value1.length(); i++) {
			if (map.containsKey(value1.charAt(i))) {
				map.put(value1.charAt(i), map.get(value1.charAt(i)) + 1);
			} else {
				map.put(value1.charAt(i), 1);
			}
		}

		for (int j = 0; j < value2.length(); j++) {
			if (map.containsKey(value2.charAt(j))) {
				map.put(value2.charAt(j), map.get(value2.charAt(j)) - 1);
				if (map.get(value2.charAt(j)) == 0) {
					map.remove(value2.charAt(j));
				}
			} else {
				map.put(value2.charAt(j), 1);
			}
		}

		return map.isEmpty();
	}

}
