package javaLearn.AbstractAndInterface;

public interface JDK8NewFeatures {
	// Learn: default method
	default void display1() {
		System.out.println("default method");
	}

	default void display3() {
		System.out.println("default method");
	}

	// Learn: Static method
	static void display2() {
		System.out.println("static method ");
	}

	// LEarn: error "Illegal modifier for the interface method display; only public,
	// abstract, default, static and strictfp are permitted"
	// private void display();
}

class Driver implements JDK8NewFeatures {

	@Override
	public void display3() {
		System.out.println("default method display3 in Driver");
	}

	// Learn: can't override static method
	// @Override
	// public static void display2() {
	// System.out.println("default method display3 in Driver");
	// }

	public static void main(String args[]) {
		JDK8NewFeatures.display2();
		Driver d = new Driver();
		d.display3();
		d.display1();
	}
}
