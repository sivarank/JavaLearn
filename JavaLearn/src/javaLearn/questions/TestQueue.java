package javaLearn.questions;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

//public class ArrayDeque<E> extends AbstractCollection<E>
//implements Deque<E>, Cloneable, Serializable
public class TestQueue {

	public static void main(String[] args) {
		// Learn: ArrayDeque
		Deque<String> tesD = new ArrayDeque<String>();
		tesD.add("One");
		tesD.add("Two");
		tesD.add("Three");
		Iterator<String> revItr = tesD.descendingIterator();
		while (revItr.hasNext()) {
			System.out.println(revItr.next());
		}

	}

}
