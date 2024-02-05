package com.java.krish.test;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println(reverseString("reverse"));
		System.out.println(reverseString("hi"));
		System.out.println(reverseString("hello"));
		System.out.println(reverseString("abcdefg"));
		System.out.println(reverseString("abcd"));

		System.out.println(reverseString1("loop"));
		System.out.println(reverseStringRecursion("pool"));
	}

	public static String reverseString(String value) {
		int left = 0;
		int right = value.length() - 1;
		char[] chars = value.toCharArray();

		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}

		return new String(chars);
	}

	public static String reverseString1(String value) {
		String result = "";

		for (int i = value.length() - 1; i >= 0; i--) {
			result += value.charAt(i);
		}
		return result;
	}

	public static String reverseStringRecursion(String value) {
		int length = value.length();
		if (length == 1) {
			return value;
		}

		return value.charAt(length - 1) + reverseStringRecursion(value.substring(0, length - 1));
	}
}
