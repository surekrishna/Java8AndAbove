package com.java.krish.test;

public class PrintHelloWorldWithoutSemicolon {

	public static void main(String[] args) {
		// Solution - 1
		if (System.out.printf("Hello World") == null) {

		}

		System.out.println();

		// Solution - 2
		if (System.out.append("Hello World") == null) {

		}

		System.out.println();

		// Solution - 3
		if (System.out.printf("Hello World").equals(null)) {

		}

		System.out.println();

		// Solution - 4
		for (int i = 0; i < 1; System.out.print("Hello World")) {
			i++;
		}

		System.out.println();
	}

}
