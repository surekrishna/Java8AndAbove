package com.java.krish.tesco;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/
public class NoOfPlatforms {

	static class TrainSchedule {
		private int arrivalTime;
		private int departureTime;

		public TrainSchedule(int arrivalTime, int departureTime) {
			this.arrivalTime = arrivalTime;
			this.departureTime = departureTime;
		}

		public String toString() {
			return "(" + this.arrivalTime + "," + this.departureTime + ")";
		}
	}

	public static void main(String[] args) {
		int[] arr = { 900, 940, 950, 1100, 1500, 1800 };
		int[] dep = { 910, 1200, 1120, 1130, 1900, 2000 };
		int res = countPlatforms(arr, dep);
		System.out.println(res);
		
		int[] arr1 = { 900, 940 };
		int[] dep1 = { 910, 1200 };
		int res1 = countPlatforms(arr1, dep1);
		System.out.println(res1);
	}

	/*
	 * Time Complexity: O(N*log(N)), Heaps take log(n) time for pushing element 
	 * and there are n elements.
	 * Auxiliary Space: O(N), Space required by heap to store the element.
	 * 
	 * Store the arrival time and departure time in array arr and sort this array 
	 * based on arrival time Declare a priority queue(min-heap) and store the departure time 
	 * of the first train and also declare a counter cnt and initialize it with 1.Iterate 
	 * over arr from 1 to n-1 check if the arrival time of the current train is less than 
	 * or equal to the departure time of the previous train which is kept on top of the 
	 * priority queue If true, then push the new departure time and increment the counter cnt 
	 * otherwise, we pop() the departure time push new departure time in the priority queue 
	 * Finally, return the cnt.
	 */
	public static int countPlatforms(int[] arrival, int[] departure) {
		int length = arrival.length;

		TrainSchedule[] trains = new TrainSchedule[length];

		for (int i = 0; i < length; i++) {
			trains[i] = new TrainSchedule(arrival[i], departure[i]);
		}

		Arrays.sort(trains, Comparator.comparingInt(train -> train.arrivalTime));
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(trains[0].departureTime);

		int count = 1;
		for (int i = 1; i < length; i++) {
			TrainSchedule current = trains[i];

			if (current.arrivalTime <= pq.peek()) {
				count++;
			} else {
				pq.poll();
			}

			pq.add(current.departureTime);
		}

		return count;
	}

}
