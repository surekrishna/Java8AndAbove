package com.java.krish.tap.two;

/*
 * 2) if Rahul as N leaves then he can plan a trip for himself.
  if Rahul left with odd leaves then he will stay only 1 day in his trip.
  and if Rahul left with even leaves then he will stay in half of his leave days in his trip.
      Print How many times Rahul can plan for the trip
  EX : N = 14 Days leave
   14 Leaves even :14/2 = 7  
   7 leaves Left Odd = 7-1 = 6
   6 leaves left even = 6/2 = 3
   3 leaves left odd = 3-1 = 2
   2 leaves left even = 2/2 = 1
   1 leaves left odd = 1-1 = 0

   so total he can plan for 6 trips in his calendar based on his holiday trip.

 */
public class TripPlanBasedOnLeaves {

	public static void main(String[] args) {
		System.out.println(noOfTripPlan(14));
		System.out.println(noOfTripPlan(13));
		System.out.println(noOfTripPlan(12));
	}

	public static int noOfTripPlan(int leaves) {
		int noOfTrips = 0;
		while (leaves > 0) {
			if (leaves % 2 == 0) {
				leaves /= 2;
				noOfTrips++;
			} else {
				leaves--;
				noOfTrips++;
			}
		}

		return noOfTrips;
	}

}
