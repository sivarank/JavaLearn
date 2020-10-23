package javaLearn.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoDArrayList {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> firstRow = new ArrayList<Integer>();
		firstRow.add(1);
		firstRow.add(2);
		firstRow.add(3);
		
		ArrayList<Integer> secondRow = new ArrayList<Integer>();
		secondRow.add(11);
		secondRow.add(21);
		
		arr.add(firstRow);
		arr.add(secondRow);
		for(ArrayList<Integer> row : arr) {
			//Arrays.toString(row.toArray(row));
			System.out.println(row.toString());
		}
		
		arr.get(0).set(2, 2222);
		System.out.println("+++++++++++++++++");
		for(ArrayList<Integer> row : arr) {
			//Arrays.toString(row.toArray(row));
			System.out.println(row.toString());
		}
	}

}
