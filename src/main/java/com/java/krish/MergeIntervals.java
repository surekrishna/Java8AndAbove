package com.java.krish.tesco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.java.krish.utils.KrishUtils;

public class MergeIntervals {

	public static void main(String[] args) {
		int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
		KrishUtils.printArray(mergeInterval(arr));
	}
	
	/*
	 *The time complexity of sorting using Arrays.sort() is O(n log n)
	 *Since the intervals are sorted, this process has a time complexity of O(n), 
	 *where n is the number of intervals. 
	 *
	 *the space complexity of the algorithm is O(n).
	 */	
	public static int[][] mergeInterval(int[][] intervals) {
		if(null == intervals || intervals.length <= 1)
			return intervals;
		
		Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
		
		List<int[]> result = new ArrayList<>();
		int[] previousInterval = intervals[0];
		result.add(previousInterval);
		
		for (int[] interval : intervals) {
			if(previousInterval[1] >= interval[0]) {
				previousInterval[1] = Math.max(previousInterval[1], interval[1]);
			} else {
				previousInterval = interval;
				result.add(previousInterval);
			}
		}
		
		
		return result.toArray(new int[result.size()][]);
		
	}

}
