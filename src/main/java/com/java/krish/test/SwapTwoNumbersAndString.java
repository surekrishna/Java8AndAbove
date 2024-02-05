package com.java.krish.test;

public class SwapTwoNumbersAndString {

	public static void main(String[] args) {
		int number1 = 100;
		int number2 = 200;
		System.out.println("Before swap, First = " + number1 + " Second = " + number2);
		swapNumbers(number1, number2);
		System.out.println("=======================");
		System.out.println("Before swap, First = " + number1 + " Second = " + number2);
		swapNumbers1(number1, number2);

	}

	public static void swapNumbers(int number1, int number2) {
		int number3 = 0;
		number3 = number2;
		number2 = number1;
		number1 = number3;
		System.out.println("After swap, First = " + number1 + " Second = " + number2);
	}

	public static void swapNumbers1(int number1, int number2) {
		number2 = number2 + number1;
		number1 = number2 - number1;
		number2 = number2 - number1;
		System.out.println("After swap, First = " + number1 + " Second = " + number2);
	}

}
