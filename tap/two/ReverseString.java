package com.java.krish.tap.two;

import java.util.Stack;

/*
 * 	1. Reverse a String. Given a string with multiple spaces, your task is to reverse it.
	
	3. reverse String. 
    given String S = "I am Rahul." output : "luhaR ma i"

 */
public class ReverseString {

	public static void main(String[] args) {
		String data = "I am Krishna";
		System.out.println(reverse(data));
		
		String data1 = "string reverse";
		System.out.println(reverse(data1));
	}
	
	public static String reverse(String data) {
		Stack<Character> stack = new Stack<>();
		StringBuilder reversed = new StringBuilder();
		
		for (char ch : data.toCharArray()) {
			stack.push(ch);
		}
		
		while (!stack.isEmpty()) {
			reversed.append(stack.pop());
		}
		
		return reversed.toString();
	}

}
