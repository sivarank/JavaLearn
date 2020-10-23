package javaLearn.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Learn1 :transient is a variables modifier used in serialization. 
//At the time of serialization, if we don’t want to save value of a particular variable in a file, 
//then we use transient keyword. When JVM comes across transient keyword, 
//it ignores original value of the variable and save default value of that variable data type.

//Learn2: transient keyword plays an important role to meet security constraints. 
//There are various real-life examples where we don’t want to save private data in file. 
//Another use of transient keyword is not to serialize the variable whose value can be calculated/derived 
//using other serialized objects or system such as age of a person, current date, etc.

//Learn3:

class TransientKeyword {
	public static void main(String args[]) {
		try {
			FileOutputStream fos = new FileOutputStream("file.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(new TransientTest());
			oos.close();
			fos.close();

			FileInputStream fis = new FileInputStream("file.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			TransientTest test = (TransientTest) ois.readObject();
			test.printValues();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class TransientTest implements Serializable {
	int i;
	// Leanr4: j value will be 0 . default data type value
	transient int j;
	static int k;
	// Learn3: Since static fields are not part of state of the object, there is no
	// use/impact of using transient keyword with static variables. However there is
	// no compilation error. l value will be 10 after deserialization
	static transient int l;

	public TransientTest() {
		System.out.println("Constructor called");
		i = j = k = l = 10;
	}

	void printValues() {
		System.out.println("i =" + i + " j=" + j + " k=" + k + " l=" + l);
	}
}
