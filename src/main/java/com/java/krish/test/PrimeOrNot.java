package com.java.krish.test;

public class PrimeOrNot {

	public static void main(String[] args) {
		System.out.println(isPrime(2));
		System.out.println(isPrime(21));
		System.out.println(isPrime(17));
		System.out.println(isPrime(93));
		System.out.println(isPrime(123));
		System.out.println(isPrime(201));
	}

	public static boolean isPrime(int number) {
		boolean isPrime = true;

		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				return !isPrime;
			}
		}

		return isPrime;
	}

}
