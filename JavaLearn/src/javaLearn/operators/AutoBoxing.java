package javaLearn.operators;

//When we assign an integer value to an Integer object, the value is autoboxed into an Integer object. 
public class AutoBoxing {
	public static void main(String[] args) {
		Integer x = 400, y = 400;
		if (x == y)
			System.out.println("Same");
		else
			System.out.println("Not Same"); // not same prints

		x = 40;
		y = 40;
		// Learn: In Java, values from -128 to 127 are cached, so the same objects are
		// returned. The implementation of valueOf() uses cached objects if the value is
		// between -128 to 127.
		if (x == y)
			System.out.println("Same");
		else
			System.out.println("Not Same");

	}
}
