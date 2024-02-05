package com.java.krish.test;

public class Test {

	public static void main(String[] args) {

		int palindrome = 101;
		int reverse = isPalindromeInRecursiveWay(palindrome, 0);
		if (palindrome == reverse) {
			System.out.println(palindrome + " is palindrome number");
		} else {
			System.out.println(palindrome + " is not a palindrome number!");
		}
		
		System.out.println("======================================");
//		int palindrome1 = 110;
//		nextPalindrome(palindrome1);

	}

	// number = 101 reve = 0, reve = 1, number = 10, reve = 10,
	public static int isPalindromeInRecursiveWay(int number, int reverse) {
		if (number > 0) {
			int reminder = number % 10;
			reverse = reverse * 10 + reminder;
			return isPalindromeInRecursiveWay(number / 10, reverse);
		}

		return reverse;
	}
	
	public static void nextPalindrome(int number) {
		if (number > 0) {
			int reverse = isPalindromeInRecursiveWay(number, 0);
			if(reverse != number) {
				nextPalindrome(number++);
			} else {
				System.out.println("Palindrome number is " + number);
			}
		}
	}

	public static int isPalindromeInRecursiveWay1(int number, int reminder) {
		int reverse = 0;
		if (number < 0) {
			return -1;
		}

		if (number > 0) {
			reminder = number % 10;
			reverse = reverse * 10 + reminder;
			isPalindromeInRecursiveWay(number / 10, reminder);
		}

		return reverse;
	}

	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int temp = number;
		while (temp > 0) {
			int reminder = temp % 10;
			reverse = reverse * 10 + reminder;
			temp = temp / 10;
		}

		return reverse == number;
	}

	// 101 (101, 0) (10, 1) , (1, 0)

}
