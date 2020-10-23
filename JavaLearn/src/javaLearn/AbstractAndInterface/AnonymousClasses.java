package javaLearn.AbstractAndInterface;

class Outer1 {
	private int i = 10;

	protected void display() {
		// Learn: static inner local classes not allowed . just local static variables
		// static class Local {
		class Local {
			private void dis() {
				System.out.println(i);
			}
		}
		new Local().dis();
	}
}

public class AnonymousClasses {
	public static void main(String args[]) {
		new Outer1().display();
	}
}
