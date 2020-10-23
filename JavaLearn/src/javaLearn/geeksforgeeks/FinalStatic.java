package javaLearn.geeksforgeeks;

//http://www.geeksforgeeks.org/compare-two-arrays-java/
import java.lang.reflect.Array;
import java.util.Arrays;
/* superclass Person */
class Person1
{
	static final int var =100; // no error
	static final int var2;
	Person1()
	{
		System.out.println("Person class Constructor");
	}
	void show(){
		System.out.println("This is show method : Person");
	}
	static {
		var2 = 11;
	}
}


class FinalStatic{
	public static void main(String args[]){
		Person1 s = new Person1();
			
	}
}