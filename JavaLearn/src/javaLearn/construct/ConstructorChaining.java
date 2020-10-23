package javaLearn.construct;

class base {
	base() {
		System.out.println("base constructor");
	}
}

public class ConstructorChaining extends base {
	ConstructorChaining() {
		this(5);
	}

	ConstructorChaining(int x) {
		super();
		// Learn: java detects recursive consturctor call , reports compile time error
		// this();
	}

	public static void main(String args[]) {
		ConstructorChaining test1 = new ConstructorChaining();
	}
}
