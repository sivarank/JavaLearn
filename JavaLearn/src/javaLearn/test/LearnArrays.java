package javaLearn.test;

import java.util.Arrays;

public class LearnArrays {
	public static void main(String args[]) {
		int a1[] = { 1, 2, 3 };
		int a2[] = { 1, 2, 3 };

		// Learn 1
		/*
		 * Learning: Use Arrays.Equal() to compare arrays
		 */
		if (Arrays.equals(a1, a2)) {
			System.out.println("both arrays are equal");
		} else {
			System.out.println("not equal");
		}

		Object oa1[] = { a1 };
		Object oa2[] = { a2 };

		if (Arrays.equals(oa1, oa2)) {
			System.out.println("Arrays.equals, both arrays are equal");
		} else {
			System.out.println("Arrays.equals , not equal");
		}
		// Learn 2
		/*
		 * Learning: Use Arrays.deepEquals() to compare arrays in deep
		 */
		if (Arrays.deepEquals(oa1, oa2)) {
			System.out.println("Arrays.deepEquals ,both arrays are equal");
		} else {
			System.out.println("Arrays.deepEquals, not equal");
		}

		Object[] object1 = new Object[] { "first", "second", new String[] { "third" } };
		Object[] object2 = new Object[] { "first", "second", new String[] { "third" } };
		/* With nested objects, Behavior is totally different */
		System.out.println("Compare object1 and object2 Using HashCode and Equals: " + Arrays.equals(object1, object2));
		System.out.println("Compare object1 and object2 Using DeepHashCode and DeepEquals: "
				+ Arrays.deepEquals(object1, object2));
		// Learn 3
		final int arr[] = { 1, 2, 3, 4, 5 }; // Note: arr is final
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 10;
			System.out.println(arr[i]);
		}
	}
}
