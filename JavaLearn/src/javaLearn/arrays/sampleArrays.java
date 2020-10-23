package javaLearn.arrays;

import java.util.Arrays;

public class sampleArrays {
	public static void main(String args[]) {
		// Learn1: Cannot define dimension expressions when an array initializer is
		// provided
		// int[] a1 = new int[2] { 1, 2 };

		int[] a1 = new int[] { 1, 2 };
		float[] f1 = new float[2];
		f1[0] = 1;
		f1[1] = 2;
		// Learn2: class name is "class [I", it is array of type Integer
		System.out.println(a1.getClass().getName());
		System.out.println(f1.getClass().getName());

		// Learn3:
		float f2[] = f1.clone();
		for (float f : f2) {
			System.out.println(f);
		}

		System.out.println("is f1 == f2 ? = " + (f1 == f2));
		System.out.println("is f1.equals(f2) ? = " + f1.equals(f2));
		System.out.println("is Arrays.equals(f1,f2) ? = " + Arrays.equals(f1, f2));
		System.out.println("f1 size =" + f1.length);
	}
}
