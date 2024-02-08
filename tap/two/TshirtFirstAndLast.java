package com.java.krish.tap.two;

import java.util.Arrays;
import java.util.List;

/*
 * 3) Rohit wants to buy t shirt where the T shirts are categorized over the size.
   In the shop overall sizes are N and Rohit's T shirt size is of K
   and Number of T shirts arranged in the sequence.
   Please print the minimum and maximum categorized position of the Rohit's shirt size.
   Input : 9 5
           1 2 5 5 5 5 8 121 123
  9 = Shop's categorized sized T shirts 
  5 Rohit's T shirt Size
  1 2 5 5 5 5 8 121 123 ----- Shirts arranged over the sizes.

  so in this Rohit's can find his T shirt at the Minimum position of 2 where 5 is present and Maximum position is 5 where he can find his T shirt
 */
public class TshirtFirstAndLast {

	public static void main(String[] args) {
		int noOfSizes = 9;
		int personSize = 5;
		String tShirts = "1 2 5 5 5 5 8 121 123";
		minMaxPositionOfTshirt(noOfSizes, personSize, tShirts);

		int noOfSizes1 = 12;
		int personSize1 = 7;
		String tShirts1 = "1 2 5 5 5 5 7 7 7 23 29 38";
		minMaxPositionOfTshirt(noOfSizes1, personSize1, tShirts1);

		int noOfSizes2 = 12;
		int personSize2 = 8;
		String tShirts2 = "1 2 5 5 5 5 7 7 7 23 29 38";
		minMaxPositionOfTshirt(noOfSizes2, personSize2, tShirts2);

		int noOfSizes3 = 9;
		int personSize3 = 5;
		String tShirts3 = "1 2 5 5 5 5 8 121 123";
		minMaxPositionOfTshirt1(noOfSizes3, personSize3, tShirts3);

		int noOfSizes4 = 12;
		int personSize4 = 7;
		String tShirts4 = "1 2 5 5 5 5 7 7 7 23 29 38";
		minMaxPositionOfTshirt1(noOfSizes4, personSize4, tShirts4);
		
		int noOfSizes5 = 12;
		int personSize5 = 6;
		String tShirts5 = "1 2 5 5 5 5 23 29 38 6 6 6";
		minMaxPositionOfTshirt1(noOfSizes5, personSize5, tShirts5);
	}

	public static void minMaxPositionOfTshirt(int noOfSizes, int personSize, String tShirts) {
		List<String> list = Arrays.asList(tShirts.split(" "));
		int firstIndex = list.indexOf(String.valueOf(personSize));
		int lastIndex = list.lastIndexOf(String.valueOf(personSize));

		if (firstIndex != -1) {
			System.out.println("First index of " + personSize + " = " + firstIndex);
		}

		if (lastIndex != -1) {
			System.out.println("Last index of " + personSize + " = " + lastIndex);
		}

		if (firstIndex == -1 && lastIndex == -1) {
			System.out.println("Number " + personSize + " not found in the string.");
		}

	}

	public static void minMaxPositionOfTshirt1(int noOfSizes, int personSize, String tShirts) {
		String[] tShirtsArray = tShirts.split(" ");
		int firstPosition = -1;
		int lastPosition = -1;

		for (int i = 0; i <= tShirtsArray.length - 1; i++) {
			if (Integer.parseInt(tShirtsArray[i]) == personSize) {
				firstPosition = i;
				break;
			}
		}

		for (int i = tShirtsArray.length - 1; i >= 0; i--) {
			if (Integer.parseInt(tShirtsArray[i]) == personSize) {
				lastPosition = i;
				break;
			}
		}

		System.out.println("First Position = " + firstPosition + " Last Position = " + lastPosition);
	}

}
