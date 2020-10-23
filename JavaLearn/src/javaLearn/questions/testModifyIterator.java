package javaLearn.questions;

import java.util.ArrayList;
import java.util.Iterator;

public class testModifyIterator {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(10);
		arr.add(14);
		Iterator<Integer> itr = arr.iterator();
		// itr.hasNext();
		System.out.println(itr.next());

		// Collection modified here
		arr.add(20);
		while (itr.hasNext())
			// Learn:"Exception in thread "main" java.util.ConcurrentModificationException"
			System.out.println(itr.next());
	}

}
