package javaLearn.testInheritance;

interface I1 {
	// Learn: void m1() {}; // fives error abstract methods does not have body
	void m1();
}

interface I2 {
	void m2();
}

class base {
	base() {
		System.out.println("base class");
	}
}

class derived extends base implements I1, I2 {
	@Override
	public void m2() {
	}

	@Override
	public void m1() {
	}
}

public class ExtendClassImplementInterface {
	public static void main(String args[]) {
		derived d = new derived();
		d.m1();
	}
}
