package com.java.krish.test;

public class CompareTwoIntegers {

	public static void main(String[] args) {
		
		/*
		 * Integer Caching
		 * int range -128 to 127 
		 * It will auto box with in the range and are equal in the range.
		 */
		Integer num1 = 100;
		Integer num2 = 100;
		System.out.println("First Number : " + num1 + " Second Number : " + num2);
		if(num1 == num2) {
			System.out.println("Both are equal!");
		} else {
			System.out.println("Both are not equal!");
		}
		
		Integer num3 = -129;
		Integer num4 = -129;
		System.out.println("First Number : " + num3 + " Second Number : " + num4);
		if(num3 == num4) {
			System.out.println("Both are equal!");
		} else {
			System.out.println("Both are not equal!");
		}
		
		Integer num5 = -128;
		Integer num6 = -128;
		System.out.println("First Number : " + num5 + " Second Number : " + num6);
		if(num5 == num6) {
			System.out.println("Both are equal!");
		} else {
			System.out.println("Both are not equal!");
		}
		
		Integer num7 = 127;
		Integer num8 = 127;
		System.out.println("First Number : " + num7 + " Second Number : " + num8);
		if(num7 == num8) {
			System.out.println("Both are equal!");
		} else {
			System.out.println("Both are not equal!");
		}
		
		Integer num9 = 128;
		Integer num10 = 128;
		System.out.println("First Number : " + num9 + " Second Number : " + num10);
		if(num9 == num10) {
			System.out.println("Both are equal!");
		} else {
			System.out.println("Both are not equal!");
		}

	}

}
