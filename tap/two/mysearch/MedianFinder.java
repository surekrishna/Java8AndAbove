package com.java.krish.tap.two.mysearch;

import java.util.Collections;
import java.util.PriorityQueue;

/*
 * https://leetcode.com/problems/find-median-from-data-stream/description/
 * 
 * The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value, and the median is the mean of the two middle values.

For example, for arr = [2,3,4], the median is 3.
For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
Implement the MedianFinder class:

MedianFinder() initializes the MedianFinder object.
void addNum(int num) adds the integer num from the data stream to the data structure.
double findMedian() returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.
 

Example 1:

Input
["MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"]
[[], [1], [2], [], [3], []]
Output
[null, null, null, 1.5, null, 2.0]

Explanation
MedianFinder medianFinder = new MedianFinder();
medianFinder.addNum(1);    // arr = [1]
medianFinder.addNum(2);    // arr = [1, 2]
medianFinder.findMedian(); // return 1.5 (i.e., (1 + 2) / 2)
medianFinder.addNum(3);    // arr[1, 2, 3]
medianFinder.findMedian(); // return 2.0
 */
public class MedianFinder {

	public static void main(String[] args) {
		MedianFinder medianFinder = new MedianFinder();
		medianFinder.addNum(2);
		medianFinder.addNum(3);
		medianFinder.addNum(4);
		
		System.out.println("Median: " + medianFinder.findMedian());
		
		MedianFinder medianFinder1 = new MedianFinder();
		medianFinder1.addNum(2);
		medianFinder1.addNum(3);
		
		System.out.println("Median: " + medianFinder1.findMedian());
		
		MedianFinder medianFinder2 = new MedianFinder();
		medianFinder2.addNum(1);
		medianFinder2.addNum(2);
		medianFinder2.addNum(3);
		medianFinder2.addNum(4);
		medianFinder2.addNum(5);
		medianFinder2.addNum(6);
		medianFinder2.addNum(7);
		medianFinder2.addNum(8);
		
		System.out.println("Median: " + medianFinder2.findMedian());
	}
	

	PriorityQueue<Integer> minHeap = new PriorityQueue<>();
	PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

	public void addNum(int num) {
		if (minHeap.size() == maxHeap.size()) {
			minHeap.add(num);
			maxHeap.add(minHeap.remove());
		} else {
			maxHeap.add(num);
			minHeap.add(maxHeap.remove());
		}

	}

	public double findMedian() {

		if (minHeap.size() == maxHeap.size()) {
			return (maxHeap.peek() + minHeap.peek()) / 2.0;
		}
		return maxHeap.peek() / 1.0;

	}

}
