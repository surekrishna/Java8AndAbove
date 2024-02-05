package com.java.krish;

import java.util.List;
import java.util.Stack;

public class Lowes {

	public static void main(String[] args) {
		// mono zip
		// repeat
		
		// Balanced Parenthesis
		List<String> values = List.of("{[{}]}", "[]{}(){([])}", "{[{[}}]}]}", "{{{{}[]]}", "{{()[]}}");
		for (String value : values) {
			System.out.println(value + " : " + isMatched(value));
		}

		// Palindrome and Next Palindrome
		List<Integer> numbers = List.of(101, 100, 22, 10001, 123, 12321, 923, 333);
		for (int number : numbers) {
			int reverse = reverse(number, 0);
			if (number == reverse) {
				System.out.println(number + " is palindrome");
			} else {
				System.out.println(number + " is not a palindrome!");
				nextPalindrome(number);
			}
		}

	}

	// Balanced Parenthesis
	public static boolean isMatched(String value) {
		boolean isMatched = true;
		Stack<Character> stack = new Stack<>();

		for (char ch : value.toCharArray()) {
			switch (ch) {
			case '{':
				stack.push(ch);
				break;
			case '[':
				stack.push(ch);
				break;
			case '(':
				stack.push(ch);
				break;
			case '}':
				if (stack.pop() != '{') {
					return !isMatched;
				}
				break;
			case ']':
				if (stack.pop() != '[') {
					return !isMatched;
				}
				break;
			case ')':
				if (stack.pop() != '(') {
					return !isMatched;
				}
				break;
			}
		}

		return isMatched;
	}

	// Palindrome and Next Palindrome
	public static int reverse(int number, int reverse) {
		if (number == 0)
			return reverse;

		reverse = reverse * 10 + number % 10;
		return reverse(number / 10, reverse);
	}

	// Palindrome and Next Palindrome
	public static void nextPalindrome(int number) {
		boolean isPalindrome = true;

		while (isPalindrome) {
			int reverse = reverse(number, 0);
			if (number == reverse) {
				System.out.println(number + " is next palindrome");
				isPalindrome = false;
			} else {
				number++;
			}
		}
	}

}
