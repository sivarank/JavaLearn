package javaLearn.stringsG;

public class IntegerToString {
	public static void main(String[] args) {
		System.out.println(Integer.toString(123));
		Integer integer = 124;
		System.out.println(integer.toString());
		System.out.println(Integer.toBinaryString(125));
		String s = 126 + "";
		System.out.println(s);
		System.out.println(Integer.toString(127, 7));
	}
}
