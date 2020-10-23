package javaLearn.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassReflection {

	public static void main(String args[]) {
		// Getting hold of Class object created
		// by JVM.
		Test2 t = new Test2();
		Class c1 = t.getClass();
		System.out.println("Class name :" + c1.getName());
		// Learn1: get class method names through reflection
		Method[] methods = c1.getDeclaredMethods();
		for (Method m : methods) {
			System.out.println("method name : " + m.getName());
		}
		// Learn1: get class field names through reflection
		Field[] fields = c1.getFields();
		for (Field f : fields) {
			System.out.println("field name : " + f.getName());
		}
	}
}

class Test2 {
	public static final int age = 32;

	void f1() {
		System.out.println("fdfd");
	}

	void f2() {
		System.out.println("fdfd");
	}
}