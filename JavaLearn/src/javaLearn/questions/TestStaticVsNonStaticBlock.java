package javaLearn.questions;

public class TestStaticVsNonStaticBlock {
	static int i = 1111;
	static {
		System.out.println("static block");
		i = i-- - --i;
	}
	{
		System.out.println("non static block execited when constructor initialized");
		i = i++ + ++i;
	}
	{
		System.out.println("non static block ");
		i = i++ + ++i;
	}

	public static void main(String[] args) {
		new TestStaticVsNonStaticBlock();
		System.out.println(i);
	}
}
