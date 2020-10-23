package javaLearn.geeksforgeeks;

//http://www.geeksforgeeks.org/compare-two-arrays-java/
import java.lang.reflect.Array;
import java.util.Arrays;
/* superclass Person */
class Test2
{
	int x =5;
	int y = 6;
	Test2()
	{
		//System.out.println("Person class Constructor");
	}
	@Override
	public String toString(){
		return "ABC dsds : "+y;
	}
}


class OverrideToStringMethod{
	public static void main(String args[]){
		Test2 s = new Test2();
		System.out.println(s);			
	}
}