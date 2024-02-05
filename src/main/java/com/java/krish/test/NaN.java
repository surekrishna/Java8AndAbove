package com.java.krish.test;

public class NaN {

	public static void main(String[] args) {
		System.out.println(0.0/0.0);//NaN
		System.out.println(1.0/0.0);//Infinity
		System.out.println(1.0/0);//Infinity
		System.out.println(Math.sqrt(-1));//NaN
		System.out.println(Float.NaN == Float.NaN);//false
		System.out.println(Float.NaN != Float.NaN);//true
		
		double nan = 1.0 % 0;
		System.out.println(nan);//NaN
		System.out.println(1.0 % 0 == nan);
		System.out.println(nan == nan);
		
		System.out.println(9.0/0);//Infinity
		System.out.println(12.33f/0);//Infinity
		System.out.println(10/0.0);//Infinity
		System.out.println(19.99999d/0);//Infinity
		System.out.println(0.0/0);//NaN
		System.out.println(12.33/0.0);//Infinity
		
		
		System.out.println(1/0);//ArithemeticException (comes with integer numbers only)
		//System.out.println(0/0);

	}

}
