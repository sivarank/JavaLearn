package javaLearn.geeksforgeeks;

//http://www.geeksforgeeks.org/compare-two-arrays-java/
import java.lang.reflect.Array;
import java.util.Arrays;

class Test1{
	static int i; // scope package level
	static {
		i = 10;
		System.out.println("Static block called");
	}
	void testMethod(){
		//static int j = 100; // local static not allowed in Java
	}
}
class StaticBlock{
	public static void main(String args[]){

			System.out.println(Test1.i);
	}
}