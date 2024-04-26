package com.java.krish.tesco;

import java.util.ArrayList;
import java.util.List;

/*
 * Another solution
 * https://www.geeksforgeeks.org/perfect-sum-problem-print-subsets-given-sum/
 * https://www.geeksforgeeks.org/problems/perfect-sum-problem5633/1?page=1&company=Tesco&sortBy=submissions
 */
public class PerfectSum {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 6, 8, 10 };
		int sum = 10;
		List<List<Integer>> results = findSubsetsWithSum(arr, sum);
		if (results.isEmpty()) {
			System.out.println("No subset found with the given sum.");
		} else {
			System.out.println("Subset with sum = " + sum + " :");
			for (List<Integer> result : results) {
				System.out.println(result);
			}
		}

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int sum1 = 10;
		List<List<Integer>> results1 = findSubsetsWithSum(arr1, sum1);
		if (results1.isEmpty()) {
			System.out.println("No subset found with the given sum.");
		} else {
			System.out.println("Subset with sum = " + sum1 + " :");
			for (List<Integer> result : results1) {
				System.out.println(result);
			}
		}
		
		int[] arr2 = { 5, 2, 3, 10, 6, 8 };
		int sum2 = 10;
		List<List<Integer>> results2 = findSubsetsWithSum(arr2, sum2);
		if (results2.isEmpty()) {
			System.out.println("No subset found with the given sum.");
		} else {
			System.out.println("Subset with sum = " + sum2 + " :");
			for (List<Integer> result : results2) {
				System.out.println(result);
			}
		}
		
		int[] arr3 = { 2, 5, 1, 4, 3 };
		int sum3 = 10;
		List<List<Integer>> results3 = findSubsetsWithSum(arr3, sum3);
		if (results3.isEmpty()) {
			System.out.println("No subset found with the given sum.");
		} else {
			System.out.println("Subset with sum = " + sum3 + " :");
			for (List<Integer> result : results3) {
				System.out.println(result);
			}
		}
	}

	/*
	 * Time Complexity: 
	 * 	The time complexity of the provided solution is exponential,
	 * 	specifically O(2^N), where N is the number of elements in the input array
	 * 	arr. 
	 * 	
	 * 	This is because the algorithm explores all possible combinations of
	 * 	elements in the array to find subsets that sum up to the target. 
	 * 	
	 * 	At each step of the recursion, the algorithm has two choices: include the current element
	 * 	in the subset or skip it. This results in a binary tree-like recursion tree
	 * 	with 2 branches at each level. 
	 * 
	 * 	As a result, the total number of recursive calls made is proportional to 2^N, 
	 * 	where N is the number of elements in the input array.
	 * 
	 * Space Complexity:
	 * The space complexity of the provided solution is O(N * 2^N), where N is the number of elements in the input array arr.
	 * This space is primarily used for storing the subsets that sum up to the target in the result list.
	 * Since there can be a maximum of 2^N subsets (each element either included or excluded in the subset), and each subset can contain up to N elements, the total space required is O(N * 2^N).
	 */
	public static List<List<Integer>> findSubsetsWithSum(int[] arr, int sum) {
		List<List<Integer>> results = new ArrayList<>();
		List<Integer> currentSubSet = new ArrayList<>();
		backtrack(arr, 0, sum, currentSubSet, results);
		return results;
	}

	/*
	 * backtrack Method: This is the recursive backtracking function that explores
	 * all possible combinations of elements to find subsets that sum up to the
	 * target. 
	 * 
	 * The method takes parameters: 
	 * 	arr: The input array. 
	 * 	index: The current index in the array being considered. 
	 * 	target: The remaining sum needed to reach the target. 
	 * 	currentSubset: The current subset being explored. 
	 * 	result: The list of subsets that sum up to the target. 
	 * 
	 * If target becomes 0, it means we've found a subset that sums up to the target. 
	 * In this case, we add the currentSubset to the result list. 
	 * If index reaches the end of the array or target becomes negative, we return, indicating that this branch of
	 * exploration does not lead to a valid subset. 
	 * Otherwise, for the current element at index index, we have two choices: 
	 * Include the current element in the subset:
	 * 	Add the current element to the currentSubset. 
	 * 	Recur for the next index with the updated target by subtracting the value of the current element
	 * 	from it. 
	 * After the recursive call, remove the last added element from the currentSubset to backtrack.
	 */
	public static void backtrack(int[] arr, int index, int sum, List<Integer> currentSubSet,
			List<List<Integer>> results) {

		// Base case
		if (sum == 0) {
			results.add(new ArrayList<>(currentSubSet));
			return;
		}

		if (index >= arr.length || sum < 0) {
			return;
		}

		// Include current element {2, 3, 5, 6, 8, 10};
		currentSubSet.add(arr[index]);
		backtrack(arr, index + 1, sum - arr[index], currentSubSet, results);
		// System.out.println("Before : " + currentSubSet);
		currentSubSet.remove(currentSubSet.size() - 1);
		// System.out.println("After : " + currentSubSet);

		// Skip current element
		backtrack(arr, index + 1, sum, currentSubSet, results);
	}

}
