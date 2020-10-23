package javaLearn.interviewBit.arrays;

import java.util.ArrayList;

public class RotateArray {

	public static ArrayList<Integer> rotate(ArrayList<Integer> A, int b) {
		int size = A.size();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			// Learn: Mistake: A[(i+b)%size] is wrong
			B.add(A.get((i + b) % size));
		}
		return B;
	}

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		// Learn: A[0] = 1 is wrong
		A.add(1);
		A.add(2);
		A.add(3);
		A.add(4);
		A.add(5);

		System.out.println(rotate(A, 3));

	}

}
