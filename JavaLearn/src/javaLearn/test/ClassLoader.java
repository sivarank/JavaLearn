package javaLearn.test;

/*
 * https://www.geeksforgeeks.org/jvm-works-jvm-architecture/
 * 
 */
public class ClassLoader {

	public static void main(String args[]) {

		Test2 t = new Test2();
		// Learn: appClassLoader loads --> Test2 class
		System.out.println("Test2 class loader : " + t.getClass().getClassLoader());
		// Learn2: Boot strap Loader loads --> String class since it is standard class
		// in JRE/Lib path, but loader name is null
		System.out.println("String class loader : " + (new String()).getClass().getClassLoader());
		System.out.println("PArent class loader :"+t.getClass().getClassLoader().getParent());
		
	}
}
