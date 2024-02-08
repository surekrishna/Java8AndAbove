package com.java.krish.tap.two.mysearch;

import java.util.LinkedList;
import java.util.List;

/*
 * https://leetcode.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k/solutions/1171635/java-2ms-solution/
 * Given an integer k, return the minimum number of Fibonacci numbers whose sum is equal to k. The same Fibonacci number can be used multiple times.

The Fibonacci numbers are defined as:

F1 = 1
F2 = 1
Fn = Fn-1 + Fn-2 for n > 2.
It is guaranteed that for the given constraints we can always find such Fibonacci numbers that sum up to k.
 

Example 1:

Input: k = 7
Output: 2 
Explanation: The Fibonacci numbers are: 1, 1, 2, 3, 5, 8, 13, ... 
For k = 7 we can use 2 + 5 = 7.
Example 2:

Input: k = 10
Output: 2 
Explanation: For k = 10 we can use 2 + 8 = 10.
Example 3:

Input: k = 19
Output: 3 
Explanation: For k = 19 we can use 1 + 5 + 13 = 19.
 */
public class FibonacciWhoseSumIsN {

	public static void main(String[] args) {
//		System.out.println(findMinFibonacciNumbers(7));
		System.out.println(findMinFibonacciNumbers1(19));
	}

	public static int findMinFibonacciNumbers(int n) {
		if (n < 2)
			return n;

		int a = 1, b = 1;
		while (b <= n) {
			b += a;
			a = b - a;
		}

		return 1 + findMinFibonacciNumbers(n - a);
	}

	public static int findMinFibonacciNumbers1(int k) {
		List<Integer> list = new LinkedList<>();		
		for (int i = 1; i <= k; i++) {
			int fib = fibonacciRecursion(i);
			if(fib <= k) {
				list.add(fib);
			} else {
				break;
			}
		}
		
		int j = list.size() - 1;
		int count = 0;
		while (k > 0) {
			int curr = list.get(j);
			
			if (curr > k) {
				j--;
			} else if (curr == k || curr < k) {
				count++;
				k -= curr;
			}
		}
		return count;
	}

	private static int fibonacciRecursion(int number) {
		if (number == 1 || number == 2)
			return 1;

		return fibonacciRecursion(number - 2) + fibonacciRecursion(number - 1);
	}

}
