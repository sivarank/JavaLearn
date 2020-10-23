package javaLearn.garbageCollection;

import java.io.Closeable;
import java.io.IOException;

/*
 * finally blocks were used to cleanup the resources before Java 7.
 * 
After java 7, resource cleanup is done automatically.

ARM is done when you initialize resource in try-with-resources block because of the interface AutoCloseable.

 Its close method is invoked by JVM as soon as try block finishes.
 
Calling close() method might lead to unexpected results.

Resource that we use in try-with-resource must be subtypes of AutoCloseable to avoid compile time error.

The resources which are used in multiple resource ARM must be closed in reverse order as given in above example
 */
public class AutomaticResourceManagement {
	public static void main(String args[]) {
		try (Demo d1 = new Demo("demo1"); Demo d2 = new Demo("demo2")) {
			//int i = 1 / 0;
			d1.show();
			d2.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after try catch");
	}
}

class Demo implements Closeable {
	String name;

	public Demo(String name) {
		this.name = name;
	}

	@Override
	public void close() throws IOException {
		System.out.println("Closing :" + this.name);
	}
	void show() {
		System.out.println("This is show method");
	}
}
