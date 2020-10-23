package javaLearn.test;

class ThisKeysword {
	ThisKeysword() {
		// Learn1 : got an error , "Constructor call must be the first statement in a
		// constructor"
		// System.out.println();
		this(10); // Learn2: Call constructor by using this()
	}

	ThisKeysword(int a) {
		System.out.println("Constructor called");
	}

	ThisKeysword retur() {
		return this;
	}

	public static void main(String args[]) {
		new ThisKeysword().retur();
	}
}
