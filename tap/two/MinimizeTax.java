package com.java.krish.tap.two;

/*
 * 	3. Minimize tax: You are given a binary string consisting of 0s and 1s - for example "110110".
	You are also given two values x and y. For each "10" appearing in array your tax would be x,
	for each "01" appearing in the array your tax would be y. You can rearrange the string in any manner you want.
	Your task is to minimize the tax.
	"1010" here 10 appears 2 times and 01 appears once so here your total tax would be 2x+y.
	Your task is to minimize the total tax.
	
	1. minimize tax -  binary string given like 11010. X rs will charge for "10" and Y Rs will charge for "01" . "11010" has two occurence of "10" and one occurenceof "01" so final tax will be X*2 + Y*1. rearrange the input binary String to minimize the tax.
 */
public class MinimizeTax {

	public static void minimizeTax(String binaryString, int costX, int costY) {
		int count10 = countOccurrences(binaryString, "10");
		int count01 = countOccurrences(binaryString, "01");

		int totalTax = costX * count10 + costY * count01;
		int minimizedTax = 0;

		System.out.println("Total Tax: " + totalTax);
		minimizedTax = count10 > count01
				? count10 * (costX > costY ? costY : costX) + count01 * (costX > costY ? costX : costY)
				: count01 * (costX > costY ? costY : costX) + count10 * (costX > costY ? costX : costY);
		System.out.println("Minimized Tax: " + minimizedTax);
	}

	private static int countOccurrences(String input, String pattern) {
		int count = 0;
		int index = input.indexOf(pattern);

		while (index != -1) {
			count++;
			index = input.indexOf(pattern, index + 1);
		}

		return count;
	}

	public static void main(String[] args) {
		String binaryString = "11010";
		int cost10X1 = 2;
		int cost01Y1 = 1;
		minimizeTax(binaryString, cost10X1, cost01Y1);

		String binaryString1 = "0110";
		int cost10X2 = 2;
		int cost01Y2 = 3;

		minimizeTax(binaryString1, cost10X2, cost01Y2);
		
		String binaryString2 = "01101";
		int cost10X3 = 2;
		int cost01Y3 = 3;

		minimizeTax(binaryString2, cost10X3, cost01Y3);
	}

}
