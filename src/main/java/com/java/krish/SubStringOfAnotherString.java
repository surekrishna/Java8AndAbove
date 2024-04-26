package com.java.krish.tesco;

//https://www.geeksforgeeks.org/given-two-strings-find-first-string-subsequence-second/
//https://www.geeksforgeeks.org/problems/check-for-subsequence4930/1?page=1&company=Tesco&sortBy=submissions
public class SubStringOfAnotherString {

	public static void main(String[] args) {
		String str1 = "AXY";
		String str2 = "ADXCPY";
		if (isSubSequence(str1, str2, str1.length(), str2.length())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		String str11 = "AXY";
		String str21 = "YADXCP";
		if (isSubSequence(str11, str21, str11.length(), str21.length())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
		String str12 = "gksrek";
		String str22 = "geeksforgeeks";
		if (isSubSequence(str12, str22, str12.length(), str22.length())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

	/*
	 * Given two strings str1 and str2, find if the first string is a Subsequence of
	 * the second string, i.e. if str1 is a subsequence of str2.
	 * Returns true if str1[] is a subsequence of str2[]
	 *  m is length of str1 and n is length of str2
	 */
	public static boolean isSubSequence(String str1, String str2, int str1Length, int str2Length) {
		boolean isSubSequence = true;

		// Base cases
		if (str1Length == 0)
			return isSubSequence;

		if (str2Length == 0)
			return !isSubSequence;

		if (str1.charAt(str1Length - 1) == str2.charAt(str2Length - 1))
			return isSubSequence(str1, str2, str1Length - 1, str2Length - 1);

		return isSubSequence(str1, str2, str1Length, str2Length - 1);
	}

}
