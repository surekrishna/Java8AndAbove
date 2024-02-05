package com.java.krish.test;

import java.util.List;

public class PalindromeAndNextPalindrome {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(101, 100, 22, 10001, 123, 12321, 923, 333);
		for(int number : numbers) {
			int reverse = reverse(number, 0);
			if(number == reverse) {
				System.out.println(number + " is palindrome");
			} else {
				System.out.println(number + " is not a palindrome!");
				nextPalindrome(number);
			}
		}

	}
	
	public static int reverse(int number, int reverse) {
		if(number == 0)
			return reverse;
		
		reverse = reverse * 10 + number % 10;
		return reverse(number / 10, reverse);
	}
	
	public static void nextPalindrome(int number) {
		boolean isPalindrome = true;
		
		while (isPalindrome) {
			int reverse = reverse(number, 0);
			if(number == reverse) {
				System.out.println(number + " is next palindrome");
				isPalindrome = false;
			} else {
				number++;
			}
		}
	}

}
