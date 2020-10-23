package javaLearn.test;

//Learn 1: same variable name reusage not allowed 

public class DuplicateVariableNameNotAllowed {
	public static void main(java.lang.String args[]) {
		{
			int x = 5;
			{
				// int x = 10; //Compile time error : "Duplicate local variable"
				System.out.println(x);
			}
		}
	}
}
