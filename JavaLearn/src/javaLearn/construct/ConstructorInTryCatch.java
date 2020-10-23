package javaLearn.construct;

public class ConstructorInTryCatch {

	// Learn: Constructor with in try catch not allowed, get compile time error
	// try
	// {
	// ConstructorInTryCatch() {
	// }
	// }catch(
	// Exception ex)
	// {
	// System.out.println("catch");
	// }

	public static void main(String args[]) {
		ConstructorInTryCatch test1 = new ConstructorInTryCatch();
	}
}
