package com.java.krish.tap.two.mysearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * https://leetcode.com/problems/combination-sum/description/
 * Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
frequency
 of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 

Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
Example 3:

Input: candidates = [2], target = 1
Output: []
 */
public class CombinationSum {
	
	public static void main(String[] args) {
		int[] candidates = {2, 3, 6, 7};
		int target = 7;
		System.out.println(combinationSum(candidates, target));
		
		int[] candidates1 = {2, 3, 5};
		int target1 = 8;
		System.out.println(combinationSum(candidates1, target1));
		
		int[] candidates2 = {2};
		int target2 = 1;
		System.out.println(combinationSum(candidates2, target2));
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        helper(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }
    public static void helper(List<List<Integer>> result, List<Integer> currentList, int[] candidates, int target, int start){
        if(target == 0){
            result.add(new ArrayList<>(currentList));
            return;
        }
        for(int i=start; i<candidates.length && candidates[i] <= target; i++){
            currentList.add(candidates[i]);
            helper(result, currentList, candidates, target-candidates[i], i);
            currentList.remove(currentList.size() - 1);
        }
    }
}
