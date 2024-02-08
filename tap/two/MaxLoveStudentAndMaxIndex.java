package com.java.krish.tap.two;

/*
 *  2. each student love N number of Student. find student who loved more.  
    input  
    N = 7 (number of student in class)
    arr[] = [1,2,3,3,3,2,2] (This is array. first index student loves 1 student, index 1 loves 2 student...)
    Output.  print index of student which loved more. if two or more student love same number of student then return highest index.
 */
public class MaxLoveStudentAndMaxIndex {

	public static void main(String[] args) {
		int n = 7;
		int[] arr = { 1, 2, 3, 3, 3, 2, 2 };
		maxLoveStudent(n, arr);

		int n1 = 9;
		int[] arr1 = { 1, 2, 3, 3, 3, 2, 2, 9, 7 };
		maxLoveStudent(n1, arr1);
	}

	public static void maxLoveStudent(int n, int[] arr) {
		int student = arr[0];
		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= student) {
				student = arr[i];
				index = i;
			}
		}

		System.out.println("Most Loved Student = " + student + " it's index = " + index);
	}

}
