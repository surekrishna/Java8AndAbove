package com.java.krish.tesco;

public class RemoveTrailingAndLeadingZerosFromString {

	public static void main(String[] args) {
		String value1 = "000123";
		System.out.println("Before : " + value1);
		System.out.println("After : " + removeLeadingZeros(value1));
		
		String value2 = "0001203";
		System.out.println("Before : " + value2);
		System.out.println("After : " + removeLeadingZeros(value2));
		
		String value3 = "000";
		System.out.println("Before : " + value3);
		System.out.println("After : " + removeLeadingZeros(value3)); 
		
		String value4 = "123000";
		System.out.println("Before : " + value4);
		System.out.println("After : " + removeTrailingZeros(value4));
		
		String value5 = "1203000";
		System.out.println("Before : " + value5);
		System.out.println("After : " + removeTrailingZeros(value5));
		
		String value6 = "000";
		System.out.println("Before : " + value6);
		System.out.println("After : " + removeTrailingZeros(value6));
	}
	
	public static String removeLeadingZeros(String value) {
		int index = 0;
		
		while (index < value.length() && value.charAt(index) == '0') {
			index++;
		}
		
//		if (index <= value.length()) {
//			return "0";
//		}
		
		return value.substring(index);
	}
	
	public static String removeTrailingZeros(String value) {
		int index = value.length() - 1;
		
		while (index >= 0 && value.charAt(index) == '0') {
			index--;
		}
		
		if (index == -1) {
			return "0";
		}
		
		return value.substring(0, index + 1);
	}

}
