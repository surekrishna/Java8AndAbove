package com.java.krish.test;

//Interface 1
interface Interface1 {
	void method1();

	void hi();
}

//Interface 2
interface Interface2 {
	void method2();

	void hi();
}

//Class implementing both interfaces
class Client implements Interface1, Interface2 {
	@Override
	public void method1() {
		System.out.println("Implementation of method1");
	}

	@Override
	public void method2() {
		System.out.println("Implementation of method2");
	}

	@Override
	public void hi() {
		System.out.println("Hi Client");

	}
}

public class MyClass {
	public static void main(String[] args) {
		Client myObject = new Client();
		myObject.method1();
		myObject.method2();
		myObject.hi();
	}
}
