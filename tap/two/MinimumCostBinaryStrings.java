package com.java.krish.tap.two;

/*
 * 	Given two binary strings A and B, what is the minimum cost of making the string equal by either flipping the digit or swapping adjacent digits...
	Input : A=1101 B=0011
	Output : 2
 */
public class MinimumCostBinaryStrings {

	public static int minCost(String A, String B) {
		int cost = 0;

		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) != B.charAt(i)) {
				if (i + 1 < A.length() && A.charAt(i) != A.charAt(i + 1) && A.charAt(i + 1) != B.charAt(i + 1)) {
					// Swap adjacent digits
					cost++;
					i++; // Skip the next character since it is already swapped
				} else {
					// Flip the current digit
					cost++;
				}
			}
		}

		return cost;
	}

	public static void main(String[] args) {
		String A = "1101";
		String B = "0011";
		int result = minCost(A, B);
		System.out.println("Minimum cost: " + result);
		
		String A1 = "11010";
		String B1 = "00111";
		int result1 = minCost(A1, B1);
		System.out.println("Minimum cost: " + result1);
		
		String A2 = "0011";
		String B2 = "1101";
		int result2 = minCost(A2, B2);
		System.out.println("Minimum cost: " + result2);
	}
}
