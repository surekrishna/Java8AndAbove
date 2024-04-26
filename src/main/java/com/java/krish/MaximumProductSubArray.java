package com.java.krish.tesco;

//https://www.geeksforgeeks.org/maximum-product-subarray/
public class MaximumProductSubArray {

	public static void main(String[] args) {
		int[] arr = { 1, -2, -3, 0, 7, -8, -2 };
		System.out.println("Maximum Subarray product is : " + maxSubarrayProduct(arr));

		int[] arr1 = { 6, -3, -10, 0, 2 };
		System.out.println("Maximum Subarray product is : " + maxSubarrayProduct(arr1));

		int[] arr2 = { -1, -3, -10, 0, 60 };
		System.out.println("Maximum Subarray product is : " + maxSubarrayProduct(arr2));
	}

	/*
	 * We will follow a simple approach that is to traverse and multiply elements 
	 * and if our value is greater than the previously stored value then store this 
	 * value in place of the previously stored value. If we encounter “0” then make 
	 * products of all elements till now equal to 1 because from the next element, 
	 * we will start a new subarray.
	 * 
	 * But what can be the problem with that?
	 * Problem will occur when our array will contain odd no. of negative elements. 
	 * In that case, we have to reject anyone negative element so that we can even 
	 * no. of negative elements and their product can be positive. Now since we are 
	 * considering subarray so we can’t simply reject any one negative element. 
	 * We have to either reject the first negative element or the last negative element.
	 * But if we will traverse from starting then only the last negative element can be 
	 * rejected and if we traverse from the last then the first negative element can be 
	 * rejected. So we will traverse from both the end and from both the traversal 
	 * we will take answer from that traversal only which will give maximum product subarray.
	 * So actually we will reject that negative element whose rejection will give us the 
	 * maximum product’s subarray.
	 * 
	 * Time Complexity: O(N) 
	 * Auxiliary Space: O(1)
	 */
	public static long maxSubarrayProduct(int[] arr) {
		long answer = Integer.MIN_VALUE;
		long product = 1;
		int length = arr.length;

		// traverse from left to right
		for (int i = 0; i < length; i++) {
			product *= arr[i];
			answer = Math.max(answer, product);
			// if any number is 0 will reset the sub array
			if (arr[i] == 0) {
				product = 1;
			}
		}

		product = 1;

		// traverse from right to left
		for (int i = length - 1; i >= 0; i--) {
			product *= arr[i];
			answer = Math.max(answer, product);
			// if any number is 0 will reset the sub array
			if (arr[i] == 0) {
				product = 1;
			}
		}

		return answer;
	}

}
