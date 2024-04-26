package com.java.krish.tesco;

//https://www.geeksforgeeks.org/count-ways-reach-nth-stair/
//https://leetcode.com/problems/climbing-stairs/solutions/3708750/4-method-s-beat-s-100-c-java-python-beginner-friendly/
public class ClimbStairs {

	public static void main(String[] args) {
		System.out.println(climbStairs(3));
		System.out.println(climbStairs1(3));
	}

	/*
	 * using recursion
	 * time complexity  O(2^n) 
	 * space complexity O(n)
	 */
	public static int climbStairs(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		
		return climbStairs(n - 1) + climbStairs(n - 2);
	}
	
	/*
	 * Time Complexity: O(n)
	 * Auxiliary Space: O(n)
	 */
	public static int climbStairs1(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		
		int[] dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		
		return dp[n];
	}
}
