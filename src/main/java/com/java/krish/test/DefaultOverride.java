package com.java.krish.test;

public class DefaultOverride implements A{
	
//	public void hi() {
//		System.out.println("Hi from DefaultOverride");
//	}

	public static void main(String[] args) {
		DefaultOverride o = new DefaultOverride();
		o.hi();
		o.hello();

	}
	
	static void hello() {
		System.out.println("Hello from A");
	}

}

interface A {
	default void hi() {
		System.out.println("Hi from A");
	}
	
	static void hello() {
		System.out.println("Hello from A");
	}
}
