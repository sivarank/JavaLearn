package javaLearn.test;
//Learn: Illegal modifier for the class StaticFunctions; only public, abstract & final are permitted

//public static class StaticFunctions {
public class StaticFunctions {

	public static void main(String args[]) {
		(new test1()).f2();
		(new test1()).f1();// waring:"The static method f1() from the type test1 should be accessed in a
							// static way"
	}
}

class test1 {

	// Learn: nested static class allowed
	static class test2 {

	}

	int b = 20;

	public static void foo() {
		System.out.println("Test.foo() called ");
		// Learn: Cannot make a static reference to the non-static field b
		// System.out.println(b);
	}

	public static void foo(int a) {
		System.out.println("Test.foo(int) called ");
	}

	public static void f1() {
		System.out.println("f1");
		// Learn: staic fun can't call non-static func
		// f2(); //Compile time error : "Cannot make a static reference to the
		// non-static method f2() from the type test1"
	}

	void f2() {
		System.out.println("f2");
		f1();
	}
}
