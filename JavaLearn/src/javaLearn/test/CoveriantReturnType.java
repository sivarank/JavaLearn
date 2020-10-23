package javaLearn.test;

class A {
};

class B extends A {
};

class C {
	A get() {
		return new A();
	}
}

class D extends C {
	B get() {
		return new B();
	}
}

class E {
	B get() {
		return new B();
	}
}

class F extends E {
	// Learn: got compile time error "The return type is incompatible with E.get()"

	// A get() {
	// return new A();
	// }
}

// Driver class
class CoveriantReturnType {
	public static void main(String[] args) {
		System.out.println(new D().get());
	}
}
