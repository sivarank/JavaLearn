package javaLearn.construct;

//Learn: by default java does not crate copy constructor 
public class CopyConstructorTest {
	public static void main(String args[]) {
		CopyConstructorTest test1 = new CopyConstructorTest();
		// we get compile time error
		// CopyConstructorTest test2 = new CopyConstructorTest(test1);
	}
}
