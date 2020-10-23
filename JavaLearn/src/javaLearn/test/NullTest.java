package javaLearn.test;

//Learn 1: break LABEL

public class NullTest {
	public static void main(java.lang.String args[]) {
		// LEARN 1: type cast allowed
		// null can be type cast to String
		String myStr = (String) null;

		// it can also be type casted to Integer
		Integer myItr = (Integer) null;

		// yes it's possible, no error
		Double myDbl = (Double) null;

		// LEARN 2:
		// An integer can be null, so this is fine
		Integer i = null;

		// Unboxing null to integer throws NullpointerException
		// int a = i;

		// LEARN3
		Integer i1 = null;
		System.out.println(i1 instanceof Integer);

		// LEARN4
		NullTest obj = null;
		obj.staticMethod();
	}

	private static void staticMethod() {
		// Can be called by null reference
		System.out.println("static method, can be called by null reference");

	}
}
