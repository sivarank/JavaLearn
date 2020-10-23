package javaLearn.AbstractAndInterface;

interface OuterInterface {
	public void InnerMethod();

	public interface InnerInterface {
		public void InnerMethod1();
	}
}

// Learn: no need to implement InnerInterface methods
class NestedInterface3 implements OuterInterface {
	@Override
	public void InnerMethod() {
		System.out.println(300);
	}
}

public class NestedInterface2 implements OuterInterface.InnerInterface, OuterInterface {
	public void InnerMethod() {
		System.out.println(100);
	}

	public static void main(String[] args) {
		NestedInterface2 obj = new NestedInterface2();
		obj.InnerMethod();
		obj.InnerMethod1();
	}

	@Override
	public void InnerMethod1() {
		System.out.println(200);
	}
}
