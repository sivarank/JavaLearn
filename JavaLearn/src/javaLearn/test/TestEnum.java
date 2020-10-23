package javaLearn.test;

//Learn1 :All enums implicitly extend java.lang.Enum class. 
//As a class can only extend one parent in Java, so an enum cannot extend anything else

//Learn2:  Every enum constant is always implicitly public static final. 
//Since it is static, we can access it by using enum Name. Since it is final, we can’t create child enums.
/*
 * https://www.geeksforgeeks.org/enum-in-java/
 * */

enum Num {
	ONE, TWO, THREE;
}

public enum TestEnum {
	RED, BLUE, WHITE;
	public static void main(java.lang.String args[]) {
		// System.out.println("enum test");
		TestEnum enu = TestEnum.BLUE;
		System.out.println(enu.toString());
		//System.out.println(enu.compareTo(Num.ONE));
	}
}
