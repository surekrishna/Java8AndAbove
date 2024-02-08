package com.java.krish.tap.two;

/*
 * 	Count the number of Shops which a person has to visit if he starts with shop number 'I' and total number of shops can be represented with N binary digits.
	Input : I=2 N=3
	Output : 6
	Explanation : 8 can be represented with 3 binary digits and he starts with shop number 2
	So he has to visit 8-2=6 shops.
 */
public class ShopCounter {

	public static int countShopsToVisit(int startingShop, int totalBinaryDigits) {
		int shopsToVisit = (int) Math.pow(2, totalBinaryDigits) - startingShop;
        return shopsToVisit;
    }

    public static void main(String[] args) {
        int startingShop = 2; // Replace this with your starting shop number
        int totalBinaryDigits = 3;   // Replace this with the total number of binary digits (N)

        int result = countShopsToVisit(startingShop, totalBinaryDigits);

        System.out.println("Number of shops to visit: " + result);
        
        int startingShop1 = 2; // Replace this with your starting shop number
        int totalBinaryDigits1 = 2;   // Replace this with the total number of binary digits (N)

        int result1 = countShopsToVisit(startingShop1, totalBinaryDigits1);

        System.out.println("Number of shops to visit: " + result1);
    }
}
