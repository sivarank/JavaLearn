package javaLearn.test;
//https://www.geeksforgeeks.org/overriding-in-java/

class Parent1 {
	void m1() {
		System.out.println("From parent m1()");
	}

	void m2() {
		System.out.println("From parent  m2()");
	}
}

class Child1 extends Parent1 {
	@Override
	// Learn1:
	// no issue while throwing unchecked exception
	void m1() throws ArithmeticException {
		System.out.println("From child m1()");
	}

	// Learn2:
	// compile-time error
	// issue while throwing checked exception
	// void m2() throws Exception {
	// System.out.println("From child m2");
	// }

}

class Parent2 {
	void m1() throws Exception {
		System.out.println("From parent m1()");
	}

	void m2() throws Exception {
		System.out.println("From parent  m2()");
	}
}

class Child2 extends Parent2 {
	@Override
	// Learn3:
	// no issue while throwing unchecked exception
	void m1() throws ArithmeticException {
		System.out.println("From child m1()");
	}

	// Learn4:
	// no issue if overriding method does not throw exception
	// Learn5: synchronized keyword does not have any impact on overridding ruels
	@Override
	synchronized void m2() {
		System.out.println("From child m2");
	}

}

// Driver class
class OverrideClassExceptions {
	public static void main(String[] args) {

	}
}
