package javaLearn.operators;

public class OperatorPrecendency {
	public static void main(String[] args) {
		int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;

		// precedence rules for arithmetic operators.
		// (* = / = %) > (+ = -)
		// prints a+(b/d)
		System.out.println("a+b/d = " + (a + b / d));

		// if same precendence then associative
		// rules are followed.
		// e/f -> b*d -> a+(b*d) -> a+(b*d)-(e/f)
		System.out.println("a+b*d-e/f = " + (a + b * d - e / f));

		a = 20;
		b = 10;
		c = 0;

		// a=b+++c is compiled as
		// b++ +c
		// a=b+c then b=b+1
		a = b++ + c;
		System.out.println("Value of a(b+c),b(b+1),c = " + a + "," + b + "," + c);

		// a=b+++++c is compiled as
		// b++ ++ +c
		// which gives error.
		// a=b+++++c;
		// System.out.println(b+++++c);

		int x = 5, y = 8;

		// concatenates x and y
		// as first x is added to "concatenation (x+y) = "
		// producing "concatenation (x+y) = 5" and then 8 is
		// further concatenated.
		// Learn2:
		System.out.println("Concatenation (x+y)= " + x + y);

		// addition of x and y
		System.out.println("Addition (x+y) = " + (x + y));

		x = -4;
		System.out.println(x >> 1);
		y = 4;
		System.out.println(y >> 1);

		// x is stored using 32 bit 2's complement form.
		// Binary representation of -1 is all 1s (111..1)
		x = -1;

		// Learn 1: >>> is unsigned right shift. >>> is ZERO fill right shift
		System.out.println(x >>> 29); // The value of 'x>>>29' is 00...0111
		System.out.println(x >>> 30); // The value of 'x>>>30' is 00...0011
		System.out.println(x >>> 31); // The value of 'x>>>31' is 00...0001

	}
}
