package javaLearn.testErrorAndException;

public class testError {
	// LEarm: we get Error when JVM running out of resources.
	// Learn : got "Exception in thread "main" java.lang.StackOverflowError"
	// LEARN: StackOverflowError extends VirtualMachineError extends Error
	// Learn: "OutOfMemoryError extends VirtualMachineError"
	// Learn: "InternalError extends VirtualMachineError"
	static void f1() {
		f1();
	}

	public static void main(String[] args) {
		f1();
	}

}
