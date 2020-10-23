package javaLearn.geeksforgeeks;

//http://www.geeksforgeeks.org/compare-two-arrays-java/
import java.lang.reflect.Array;
import java.util.Arrays;
/* superclass Person */
class Person
{
	int var =100;
	Person()
	{
		System.out.println("Person class Constructor");
	}
	void show(){
		System.out.println("This is show method : PErson");
	}
}

/* subclass Student extending the Person class */
class Student extends Person
{
	int var =110;
	Student()
	{
		// invoke or call parent class constructor
		super();
	//Person(); getting error, we can't call child constructor directly 
		System.out.println("Student class Constructor");
		System.out.println("var value : "+super.var);
		super.show();
	}
	void show(){
		System.out.println("This is show method : Student");
	}
}

class SuperKeyword{
	public static void main(String args[]){
		Student s = new Student();
	}
}