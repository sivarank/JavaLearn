package javaLearn.AbstractAndInterface;

interface Test {
	// Learn: all methods in an interface are public even if we do not specify
	// public with method names. Also, data fields are "public static final" even if
	// we do not mention it with fields names. Therefore, data fields must be
	// initialized.

	// LEARN: Illegal modifier for the interface field Test.i; only public, static &
	// final are permitted
	// protected int i =10;
	int i = 10;
	final int ii = 10;
	final static int iii = 10;

	// LEARN: Illegal modifier for the interface method show; only public, abstract,
	// default, static and strictfp are permitted
	// protected void show();

	// LEARN: Abstract methods do not specify a body
	// void show() {}
	void show();
}

public class NonPublicMethodsInInterface {

}
