package javaLearn.AbstractAndInterface;

class Outer {
	private int o_i = 0;
	private static int o_i1 = 0;

	private class Inner1 {
		private int i1_i = 10;

		void dispaly() {
			System.out.println(o_i);
		}
	}

	// Learn: this static nested class so it can access only access outer class's
	// static fields
	static class Inner2 {
		int i2_i;

		void dispaly() {
			System.out.println(o_i1);
			//System.out.println(o_i);// Compile time error
		}
	}

	void display() {
		System.out.println((new Inner1()).i1_i);
	}
}

public class NestedClasses {
	public static void main(String args[]) {
		new Outer().display();
		new Outer.Inner2().dispaly();
	}
}
