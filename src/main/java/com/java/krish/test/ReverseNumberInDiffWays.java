package com.java.krish.test;

public class ReverseNumberInDiffWays {

	public static void main(String[] args) {

		int number1 = 1234;
		System.out.println(number1 + " reverse number is : " + reverse1(number1));
		
		int number2 = 101;
		System.out.println(number2 + " reverse number is : " + reverse1(number2));
		
		int number3 = 923;
		System.out.println(number3 + " reverse number is : " + reverse1(number3));
		
		int number4 = 10;
		System.out.println(number4 + " reverse number is : " + reverse1(number4));

	}

	public static int reverse1(int number) {
		StringBuilder sb = new StringBuilder(String.valueOf(number));
		return Integer.parseInt(sb.reverse().toString());
	}

	public static int reverse2(int number) {
		int reverse = 0;
		while (number > 0) {
			reverse = reverse * 10 + number % 10;
			number /= 10;
		}

		return reverse;
	}

	public static int reverse3(int number, int reverse) {
		if (number == 0)
			return reverse;

		reverse = reverse * 10 + number % 10;
		return reverse3(number / 10, reverse);
	}

	public static int reverse4(int number, int reverse) {
		for (int i = 0; number != 0; i++) {
			reverse = reverse * 10 + number % 10;
			number /= 10;
		}

		return reverse;
	}

}
