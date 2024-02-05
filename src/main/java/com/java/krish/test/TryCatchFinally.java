package com.java.krish.test;

public class TryCatchFinally {

	public static void main(String[] args) {
		System.out.println(returnSomething());

	}

	public static int returnSomething() {
		try {
			System.out.println("try");
			//System.out.println(10 / 0);
			return 1;
		} catch (Exception e) {
			System.out.println("catch");
			return 2;
		} finally {
			System.out.println("finally");
			//return 3;
		}
	}

}
