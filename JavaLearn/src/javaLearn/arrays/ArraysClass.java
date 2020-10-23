package javaLearn.arrays;

import java.util.Arrays;
import java.util.Collections;

// A class to represent a student.
class Student {
	int rollno;
	String name, address;

	// Constructor
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Used to print student details in main()
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}
}

public class ArraysClass {
	public static void main(String args[]) {
		int ar[] = { 4, 6, 1, 8, 3, 9, 7, 4, 2 };

		// To print the elements in one line
		System.out.println(Arrays.toString(ar));

		Arrays.sort(ar);
		String arr[] = { "practice.geeksforgeeks.org", "quiz.geeksforgeeks.org", "code.geeksforgeeks.org" };
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		// Learn 1: sort
		System.out.println(Arrays.toString(ar));
		// Learn 2: BinarySearch()
		System.out.println(Arrays.binarySearch(ar, 6));

		// https://www.geeksforgeeks.org/arrays-binarysearch-in-java-with-examples-set-2-search-in-subarray/
		float floatArr[] = { 10.2f, 15.1f, 2.2f, 3.5f };
		System.out.println(35f + " found at index = " + Arrays.binarySearch(floatArr, 1, 4, 35f)); // Learn: return -5.
																									// -Array.Lenth
																									// since element not
																									// fund and all are
																									// less than key

		Student[] arr1 = { new Student(111, "bbbb", "london"), new Student(131, "aaaa", "nyc"),
				new Student(121, "cccc", "jaipur") };

		System.out.println(Arrays.toString(arr1));

		// Trying to print multidimensional array using
		// toString
		int[][] mat = new int[2][2];
		mat[0][0] = 99;
		mat[0][1] = 151;
		mat[1][0] = 30;
		mat[1][1] = 50;
		System.out.println(Arrays.toString(mat));
		// Learn: deepToString()
		System.out.println(Arrays.deepToString(mat));
		// Learn: can't sort multi dimnetional array. each row we need to sort
		// Arrays.sort(mat);
		Arrays.sort(mat[0]);
		Arrays.sort(mat[1]);
		System.out.println(Arrays.deepToString(mat));
	}
}
