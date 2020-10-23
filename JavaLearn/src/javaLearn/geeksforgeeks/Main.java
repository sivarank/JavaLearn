package javaLearn.geeksforgeeks;

class Test {
	// class contents
	void show() {
		System.out.println("Test::show() called");
	}
}

public class Main {
	public static void main(String[] args) {
		Test t = new Test();
		t.show(); // Error here because t is not initialed
	}

}
