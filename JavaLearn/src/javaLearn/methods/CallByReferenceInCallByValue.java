package javaLearn.methods;

class TestCallByValue {
	private int a;

	public TestCallByValue(int i) {
		a = i;
	}

	void change(int i) {
		a = i;
	}

	void print() {
		System.out.println(a);
	}
}

public class CallByReferenceInCallByValue {

	static void change(TestCallByValue tes) {
		System.out.println(tes.hashCode());
		tes.change(10);
	}

	public static void main(String args[]) {
		TestCallByValue tes = new TestCallByValue(5);
		System.out.println(tes.hashCode());
		change(tes);
		tes.print();
	}
}
