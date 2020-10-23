package javaLearn.methods;

//http://chaseyourjava.blogspot.com/2017/12/default-methods-in-java-8.html

//https://www.geeksforgeeks.org/default-methods-java/

//A simple Java program to demonstrate multiple
//inheritance through default methods.
interface TestInterface1 {
	void f1();

	// default method
	default void show() {
		System.out.println("Default TestInterface1");
	}
}

interface TestInterface2 {
	// Default method
	default void show() {
		System.out.println("Default TestInterface2");
	}
}

class B implements TestInterface1 {

	@Override
	public void f1() {
		// TODO Auto-generated method stub

	}
	// Learn2: no need to implement interface default methods
}

// Implementation class code
class DefaultMethodInInterface implements TestInterface1, TestInterface2 {
	// Overriding default show method
	@Override
	public void show() {
		// use super keyword to call the show
		// method of TestInterface1 interface
		TestInterface1.super.show();

		// use super keyword to call the show
		// method of TestInterface2 interface
		TestInterface2.super.show();
	}

	public static void main(String args[]) {
		DefaultMethodInInterface d = new DefaultMethodInInterface();
		d.show();
	}

	@Override
	public void f1() {
		// TODO Auto-generated method stub

	}
}