package javaLearn.geeksforgeeks;

public class IntegerToString2 {
	public static void main(String args[]) {
		Integer val = new Integer(10);
		String str = val.toString();
		System.out.println(str);
		
		System.out.println(Integer.toString(11));
		System.out.println(Integer.toString(11,2));
	}
}