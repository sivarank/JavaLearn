package javaLearn.arrays;

import java.util.ArrayList;

public class ArrayVsArrayList {
	public static void main(String args[]) {
		// Learn1:Primitive data types not allowed for ArrayList. but normal array 
		//"int a[]" supports primitive types
		// ArrayList<int> alist = new ArrayList<int>();
		
		ArrayList<Integer> alist = new ArrayList<Integer>();
		//<Integer>
		// Learn2: there is no size restriction for ArrayList
		alist.add(1);
		alist.add(2);
		//alist.add(1.3);
		System.out.println("size =" + alist.size());
		alist.remove(1);
		System.out.println("size =" + alist.size());

		Object a[] = alist.toArray();
	}
}
