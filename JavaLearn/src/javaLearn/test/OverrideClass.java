package javaLearn.test;
//https://www.geeksforgeeks.org/overriding-in-java/

// A Simple Java program to demonstrate 
// Overriding and Access-Modifiers

//The access modifier for an overriding method can allow more, but not less, 
//access than the overridden method. For example, a protected instance method in the super-class can 
//be made public, but not private, in the subclass. Doing so, will generate compile-time error.

class Parent {
	// private methods are not overridden
	private void m1() {
		System.out.println("From parent m1()");
	}

	// Learn1: The methods or data members declared as protected are accessible
	// within same package or sub classes in different package.
	// SURPRISE
	protected void m2() {
		System.out.println("From parent m2()");
	}
}

class Child extends Parent {
	// new m1() method
	// unique to Child class
	private void m1() {
		System.out.println("From child m1()");
	}

	// overriding method
	// with more accessibility
	@Override
	protected void m2() {
		System.out.println("From child m2()");
	}

}

// Driver class
class OverrideClass {
	public static void main(String[] args) {
		Parent obj1 = new Parent();
		obj1.m2();
		Parent obj2 = new Child();
		obj2.m2();
	}
}
