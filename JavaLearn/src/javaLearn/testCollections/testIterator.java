package javaLearn.testCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class testIterator {
	public static void main(String args[]) {
		ArrayList<String> arr = new ArrayList<String>();// {"One", "two"};
		arr.add("one");
		arr.add("two");

		Iterator<String> itr = arr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
			// lEARN: If you modify it, you get "Exception in thread "main"
			// java.util.ConcurrentModificationException"
			arr.add("three");
		}

		// Learn: Itarable is represent series of elements, it only one method iterator.
		// It does not have state. It is used in for each loop.

		// Learn: Iterator has three methods hasNext(), next() & remove(). Iterator has
		// state which means it can say what is current point element

		// Iterable<T>

		// Learn: ListIterator<E> extends Iterator<E>. ListIterator is bi directional
		ListIterator<String> lItr = arr.listIterator();

		// Queue<E>
		// Vector<E>
		// Learn: stack implements vector
		// Stack<E>
		// HashMap<K, V>
	}
}
