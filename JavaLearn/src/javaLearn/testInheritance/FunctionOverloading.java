package javaLearn.testInheritance;

//https://www.geeksforgeeks.org/does-overloading-work-with-inheritance/
//Overloading works with inheritance But C++ does not work because of name hiding. 
// in c++, we can fix name hiding by "using Base1::f;" statement in Derived1 class.
//in C# also, the behaviour is same since c# implemented close to C++ 
class Base1 {
	int sum(int a) {
		return a + 3;
	}
}

class Derived1 extends Base1 {
	float sum(float b) {
		return (float) (b + 3.3);
	}
}

public class FunctionOverloading {
	public static void main(String args[]) {
		Derived1 d = new Derived1();
		System.out.println(d.sum(3));
		System.out.println(d.sum((float) 3.3));
	}

}
