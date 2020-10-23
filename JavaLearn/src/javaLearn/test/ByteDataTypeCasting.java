package javaLearn.test;

//Learn 1: 

public class ByteDataTypeCasting {
	public static void main(java.lang.String args[]) {
		byte b;
		int i = 258;
		double d = 323.142;
		System.out.println("Conversion of int to byte.");

		// i%256 //LEARN b value will be 2
		b = (byte) i;
		System.out.println("i = " + i + " b = " + b);
		System.out.println("Conversion of double to byte.");

		// d%256
		b = (byte) d;
		System.out.println("d = " + d + " b= " + b);
	}
}
