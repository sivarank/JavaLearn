package javaLearn.construct;

public class ConstructorWithReturnType {
	// Learn: this is no more a constructor, this is just a method with class name
	// Get warning"this method has constructor name"
	int ConstructorWithReturnType() {
		System.out.println("entered");
		return 10;
	}

	public static void main(String args[]) {
		ConstructorWithReturnType test1 = new ConstructorWithReturnType();
		System.out.println(test1.ConstructorWithReturnType());
	}
}
