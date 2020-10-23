package javaLearn.methods;

class sup {
	// Learn: final does not have any impact here since test() is private method
	final private void test() {
	}
}

class sub extends sup {
	void test() {
	}
}

public class PrivateFinalMethod {
	public static void main(String args[]) {
		sup s = new sub();
		// LEarn: below we get compilation error
		//s.test();
	}
}
