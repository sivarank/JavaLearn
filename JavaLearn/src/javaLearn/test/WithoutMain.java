package javaLearn.test;

//Learn1 :With out main, JVM can't execute the code. runtime error
//Learn 2: WithoutMain object won't be created
//Learn3: File name and class name should be same ?
//No. only for public class filename and class should be same. Below code works fine.
//Learn4 : by default WithoutMain1 object is not created

abstract class WithoutMain1 {
	static {
		System.out.println("Static block");
		System.exit(0); // program exits here
	}

	public static void main(String args[]) {
		System.out.println("in main block");
	}
}
