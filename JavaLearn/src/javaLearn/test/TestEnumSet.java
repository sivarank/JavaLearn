package javaLearn.test;

import java.util.Collections;
import java.util.EnumSet;
enum operation{
	ONE,TWO,THREE
}

public class TestEnumSet {

	public static void main(String[] args) {
		//Learn: we can't use constructor directly for EnumSet. use "noneof" to get empty set.
		EnumSet<operation> test = EnumSet.noneOf(operation.class);
		test.add(operation.ONE);
		//Collections.synchronizedList(list)
	}

}
