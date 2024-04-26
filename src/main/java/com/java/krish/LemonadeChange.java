package com.java.krish.tesco;

//https://leetcode.com/problems/lemonade-change/solutions/4896250/lemonade-change-using-switch-case/
public class LemonadeChange {

	public static void main(String[] args) {
		int[] arr = {5, 5, 5, 10, 20};
		System.out.println(lemonadeChange(arr));
		
		int[] arr1 = {5, 5, 10, 10, 20};
		System.out.println(lemonadeChange(arr1));
	}

	/*
	 * Time complexity:  O(n)
	 * Space complexity: O(1)
	 */
	public static boolean lemonadeChange(int[] bills) {
		boolean isLemonade = true;
		int bill5 = 0;
		int bill10 = 0;
		int bill20 = 0;
		
		for (int i = 0; i < bills.length; i++) {
			switch(bills[i]) {
				case 5:
					bill5++;
					break;
				case 10:
					if (bill5 > 0) {
						bill5--;
						bill10++;
					} else {
						return !isLemonade;
					}
					
					break;
				case 20:
					if(bill10 > 0 && bill5 > 0) {
						bill20++;
						bill10--;
						bill5--;
					} else if (bill5 > 2){
						bill20++;
						bill5 -= 3;
						
					} else {
						return !isLemonade;
					}
					
					break;
			}
		}
		
		return isLemonade;
	}

}
