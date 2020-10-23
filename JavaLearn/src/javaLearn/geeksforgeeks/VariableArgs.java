package javaLearn.geeksforgeeks;

//http://www.geeksforgeeks.org/compare-two-arrays-java/
import java.lang.reflect.Array;
import java.util.Arrays;
/* superclass Person */


class VariableArgs{
	private static void print(int ...a){
		System.out.println("length = "+a.length);
		for(int i: a){
			System.out.println(i);
		}
	}
	public static void main(String args[]){
		print(1);
		print(1,2);
	}
}