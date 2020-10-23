package javaLearn.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Learn 1: protected or private top level classes not allowed.
//Only top level class cannot be private or protected. 
//Nested classes can be private and protected. 
//So in general, the statement 1)Modifiers : A class can be public or private or protected 
//or has default access is correct

//protected class ObjectCreation {
//	public static void main(java.lang.String args[]) {
//
//	}

class ObjectCreation {
	// Learn 2: inner class can be private or protected
	private class Inner {

	}

	public static void main(String args[]) throws CloneNotSupportedException {
		try {
			// Learn2: create objec through class.newInstance()
			ObjCreationTest test = (ObjCreationTest) ObjCreationTest.class.newInstance();
			// Learn3: no need to create new reference variable for new object to save
			// memeory .
			// Garbage collector frees old (unreferenced) object
			test = new ObjCreationTest();
			// Learn 4:An anonymous class is a class that is created in an instantiation
			// expression, and
			// you cannot directly access the class without accessing the instance.
			// That's why it's called an anonymous class.
			// Below anonymous class is a child of ObjCreationTest and tes() overrides
			// parent method
			ObjCreationTest anonymous = new ObjCreationTest() {
				public void tes() {
					System.out.println("Test Anonymous class");
				}
			};
			anonymous.tes();

			// Learn 6: clone class
			TestClone clone = new TestClone();
			TestClone clone1 = (TestClone) clone.clone();

			// Learn 7: we can create object through deserialization
			FileOutputStream fos = new FileOutputStream("File.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(new DeserializationExample()); // saved object in file
			oos.close();
			fos.close();

			FileInputStream fis = new FileInputStream("File.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			DeserializationExample readObject = (DeserializationExample) ois.readObject();
			System.out.println(readObject.code);

			ois.close();
			fis.close();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}

class ObjCreationTest {
	public void tes() {
		System.out.println("Test class");
	}
}

class TestClone implements Cloneable {
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class DeserializationExample implements Serializable {
	public static final String code = "SERIALIAZABLE";
}
