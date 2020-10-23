package javaLearn.methods;

public class MethodOverloadAndNull {
	// Overloaded methods
	public void fun(Integer i) {
		System.out.println("fun(Integer ) ");
	}

	public void fun(String name) {
		System.out.println("fun(String ) ");
	}

	// Driver code
	public static void main(String[] args) {
		MethodOverloadAndNull mv = new MethodOverloadAndNull();

		// Learn:compiler can't take a decision to invoke function
		// This line causes error
		// mv.fun(null);
	}
}
