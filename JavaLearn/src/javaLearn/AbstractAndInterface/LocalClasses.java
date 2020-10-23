package javaLearn.AbstractAndInterface;

interface I11 {
	void tes1();
}

class Outer11 {
	void tes2() {
	}
}

// https://www.geeksforgeeks.org/anonymous-inner-class-java/
/*
 * A normal class can implement any number of interfaces but anonymous inner
 * class can implement only one interface at a time.
 * 
 * A regular class can extend a class and implement any number of interface
 * simultaneously. But anonymous Inner class can extend a class or can implement
 * an interface but not both at a time.
 * 
 * For regular/normal class, we can write any number of constructors but we cant
 * write any constructor for anonymous Inner class because anonymous class does
 * not have any name and while defining constructor class name and constructor
 * name must be same.
 */
public class LocalClasses {
	public static void main(String args[]) {
		int outt = 111;
		I11 i11 = new I11() {
			@Override
			public void tes1() {
				System.out.println("Interface anonymous class");
			}
		};

		i11.tes1();

		Outer11 i22 = new Outer11() {

			// Learn: we can't declare constructor for this anonymous class
			public int xx = 100;

			@Override
			public void tes2() {
				System.out.println("Class anonymous class");
				System.out.println("outt :" + outt);
				System.out.println("xx :" + xx);
			}
		};
		i22.tes2();
	}
}
