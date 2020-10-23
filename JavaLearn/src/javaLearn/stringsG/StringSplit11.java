package javaLearn.stringsG;

public class StringSplit11 {
	public static void main(String[] args) {
		String str = "1234.567";
		String a[] = str.split("."); // Learn1: here "." match any character in regex.
		System.out.println(a.length);
		for (String s : a) {
			System.out.println(s);
		}
		// Learn2: default limit value is 0
		String b[] = str.split("\\.");
		for (String s : b) {
			System.out.println(s);
		}

		String c[] = "1_2_3_4_5".split("_", 2);
		for (String s : c) {
			System.out.println(s);
		}
		String d[] = "boo:and:foo".split("o", 0);
		System.out.println("Length =" + d.length);
		for (String s : d) {
			System.out.println(s);
		}

		String e[] = "boo:and:foo".split("o", -1);
		System.out.println("Length =" + e.length);
		for (String s : e) {
			System.out.println(s);
		}
	}
}
