package javaLearn.AbstractAndInterface;

import java.util.function.Predicate;

@FunctionalInterface
interface Square {
	int calculateSquare(int x);
	// Learn:A functional interface has only one abstract method but it can have
	// multiple default methods.
	//int cube(int x);
}

public class FunctionalInterface1 {
	public static void main(String args[]) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Running child thread");
			}
		}).start();
		System.out.println("this main threead");

		// lEARN: LAmda expressions

		new Thread(() -> {
			System.out.println("LAMDA Running child thread");
		}).start();

		// LAMDA

		Square s = (x) -> x * x;
		System.out.println("Square :" + s.calculateSquare(10));

		Predicate<String> p = (str) -> str.startsWith("G");
		if (p.test("GFG")) {
			System.out.println("GFG : pattern mateched");
		}
		if (!p.test("C")) {
			System.out.println("GFG : pattern not mateched");
		}

	}
}
