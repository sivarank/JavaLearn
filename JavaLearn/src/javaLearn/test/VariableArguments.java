package javaLearn.test;

public class VariableArguments {

	public static void main(String args[]) {
		arguments(1);
		arguments(1, 2);
		arguments2(1.1, 2);
	}

	// Learn: int... varaible argumets
	static void arguments(int... val) {
		for (int i : val) {
			System.out.println(i);
		}
	}

	// Learn: variable arguments parameter should last one
	static void arguments2(double f, int... val) {

	}

	// Learn: variable arguments parameter should last one
	// static void arguments3(int... val, float f) {
	// }
}
