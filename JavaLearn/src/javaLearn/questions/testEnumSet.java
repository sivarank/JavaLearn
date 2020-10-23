package javaLearn.questions;

import java.util.EnumSet;

enum colour {
	RED, BLACK, ORANGE, WHITE
}

/**
 * EnumSet is one of the specialized implementation of Set interface for use
 * with the enumeration type. Few important features of EnumSet are as follows:
 * 
 * It extends AbstractSet and implements Set Interface in Java.
 * 
 * EnumSet class is a member of the Java Collections Framework & is not
 * synchronized.
 * 
 * It’s a high performance set implementation, much faster than HashSet.
 * 
 * All of the elements in an enum set must come from a single enumeration type
 * that is specified when the set is created either explicitly or implicitly.
 * 
 * @author siva
 *
 */
public class testEnumSet {

	public static void main(String[] args) {
		EnumSet<colour> set1, set2, set3;
		set1 = EnumSet.of(colour.RED, colour.WHITE);
		set2 = EnumSet.allOf(colour.class);
		set3 = EnumSet.complementOf(set1);

		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
	}

}
