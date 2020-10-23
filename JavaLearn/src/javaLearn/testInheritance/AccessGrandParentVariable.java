package javaLearn.testInheritance;

class GP {
	int i = 10;
}

class P extends GP {
	int j = 100;
}

class C extends P {
	void printGrandParent() {
		System.out.println(i);
		System.out.println(super.i);
		// Learn: we can not access grand parent variable directly "super.super.i"
	}
}

public class AccessGrandParentVariable {
	public static void main(String args[]) {
		new C().printGrandParent();
	}
}
