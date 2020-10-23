package javaLearn.interviewBit.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {
	/**
	 * @param A
	 * @return
	 */
	public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
		int noRows = A.size();
		int noColumns = A.size() > 0 ? A.get(0).size() : 0;

		ArrayList<Integer> result = new ArrayList<Integer>();
		int left = 0, right = noColumns - 1, top = 0, bottom = noRows - 1;
		while (left <= right && top <= bottom) {
			// Left to right
			int i = left;
			while (i <= right) {
				result.add(A.get(top).get(i++));
			}
			top++;
			i = top;
			// top to down
			while (i <= bottom) {
				result.add(A.get(i++).get(right));
			}
			right--;

			i = right;
			// right to left
			while (i >= left && bottom >= top) {
				result.add(A.get(bottom).get(i--));
			}
			bottom--;
			// bottom to top.
			i = bottom;
			while (i >= top && left <= right) {
				result.add(A.get(i--).get(left));
			}
			left++;
		}
		return result;
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
		list2.add(list);
		list.add(1);
		list.add(2);
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		list3.add(10);
		list3.add(20);
		list2.add(list3);
		System.out.println(spiralOrder(list2));
	}

}
