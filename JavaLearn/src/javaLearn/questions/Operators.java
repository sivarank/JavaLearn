package javaLearn.questions;

public class Operators {
	public static void main(String args[]) {
		// int i = 1++2;
		//int j = 1++2;// Compiler treat generate tokens 1,++,2. so error 1++ can not
		// be save on const.
		int b = 1;
		int c = 2;
		int a = b++ + c;
		// a = b++++c;
		// Learn: we can not perform post and prefix operation on const
		//int z = 1++;
		// int z = ++1;

		int z = 1 + +2;
		System.out.println(a);
	}
}
