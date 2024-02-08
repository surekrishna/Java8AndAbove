package com.java.krish.tap.two;

/*
 * 4)  A hotel has some different serving method where they serve food on the basis of queue.
    if there 10 customers in the queue then they will serve the first K customers in the first service then in the second service they serve the last k customers of the queue , then again first k customers in the third service and goes on .
  so find out the customer who will be served last in the queue based on the queue length.

  Input :
  1) 9 3
    9 is the length of the queue.
    3 is the k customers they serve in the queue for each service.
  2) { 1,2,3,4,5,6,7,8,9}

  so in this example 
  1) first service they serve the food for the first 3 customers 1,2,3 then customers of {4,5,6,7,8,9} are left.
  2) in the second service they serve the food for the last 3 customers 7,8,9 then customers of {4,5,6} are left.
  3) in the third service they serve the food for the first 3 customers 4,5,6 then no customers are left in the queue. 
    so here the last customer to whom they have served is 6.
 */
public class HotelServeLastCustomer {

	public static void main(String[] args) {
		int queueLength = 9;
		int k = 3;
		int[] customers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(lastCustomer(queueLength, k, customers));

		int queueLength1 = 10;
		int k1 = 2;
		int[] customers1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(lastCustomer(queueLength1, k1, customers1));

		int[] customers2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
		int queueLength2 = 11;
		int k2 = 4;
		System.out.println(lastCustomer(queueLength2, k2, customers2));
		
		int[] customers3 = { 1, 2 };
		int queueLength3 = 2;
		int k3 = 4;
		System.out.println(lastCustomer(queueLength3, k3, customers3));
	}

	public static int lastCustomer(int queueLength, int k, int[] customers) {
		int service = 1;
		int start = 0;
		int end = customers.length - 1;

		while (queueLength > k) {
			if (service % 2 == 0) {
				end -= k;
			} else {				
				start = start == 0 ? start + k - 1 : start + k;				
			}

			service++;
			queueLength -= k;
		}

		return customers[end];
	}
}
