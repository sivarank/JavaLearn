package javaLearn.stringsG;

public class StringToInteger {
	public static void main(String[] args) {
		System.out.println(Character.MIN_RADIX);// it is 2
		System.out.println(Character.MAX_RADIX);// it is 36 bacause 10 numbers + 26 alphabets(case insensitive)
		String str = "123";
		int val = Integer.parseInt(str);
		System.out.println(val);

		int val2 = Integer.parseInt("22", 3);
		System.out.println(val2);

		// Learn: Integer.parseInt("3", 3) throws exception "NumberFormatException"
		// because 3 radix numbers range from 0 to 2

		System.out.println(Integer.parseInt("iiiZ", 36));
	}
}
