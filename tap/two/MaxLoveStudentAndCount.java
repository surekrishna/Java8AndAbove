package com.java.krish.tap.two;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/*
 * 	2. You are given an array a. Array values range from 0 to N-1. Where N is the size of the array. For 0<=i<=N-1, ith person loves a[i]th person. Your task is to find out the most loved index(person) and count how many index(people) loved that index(person).
	Example:
	a=[1,2,3,3,3,2,2]
	here no one likes 0th index
	0th index likes 1st index
	1st index likes 2nd index
	2nd index likes 3rd index
	3rd index likes itself
	4th index likes 3rd index
	5th index likes 2nd index
	6th index likes 2nd index
	
	So here index 0 is loved by 0 people
	index 1 is loved by 1 person ( that is 0th index)
	index 2 is loved by 3 people (index 1,5 and 6th index)
	index 3 is loved by 3 people (index 2,3(itself) and 4th index)
	index 4,5,6 are not loved by anyone.
	
	so here highest loved count is 3 for indices 2 and 3 out of which 3 is higher so we need to print index 3 and number of people loved it i.e 3
	
	so output would be 3,3
 */
public class MaxLoveStudentAndCount {

	public static void main(String[] args) {
		int[] love = { 1, 2, 3, 3, 3, 2, 2 };
		loveIndexAndCount(love);

		int[] love1 = { 1, 2, 3, 3, 4, 4, 4, 1, 5 };
		loveIndexAndCount(love1);
		
		int[] love2 = { 1, 1, 3, 1, 4, 1, 4, 1, 5 };
		loveIndexAndCount(love2);
	}

	public static void loveIndexAndCount(int[] love) {
		int student = 0;
		int count = 0;
		int length = love.length;

		Map<Integer, List<Integer>> map = new LinkedHashMap<>();
		for (int i = 0; i < length; i++) {
			List<Integer> list = new ArrayList<>();
			for (int j = 0; j < length; j++) {
				if (i == love[j]) {
					list.add(j);
				}
			}
			map.put(i, list);
		}

		for (int key : map.keySet()) {
			int size = (int) map.get(key).size();
			if (size >= count) {
				count = size;
				student = key;
			}
		}

		System.out.println("maxLovedStudent = " + student + " maxLovedStudentCount = " + count);
	}

}
