package javaLearn.stringsG;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestStringPoolRegularExpressions {

	public static void main(String[] args) {
		// Learn: "Hello" created in String pool.
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println("s1 hashcode :" + s1.hashCode());
		System.out.println("s2 hashcode :" + s2.hashCode());
		System.out.println("s1 == s2 ? " + (s1 == s2));

		// Learn: here new string in outside string pool
		String s3 = new String("Hello");
		System.out.println("s3 hashcode :" + s3.hashCode());
		System.out.println("s1 == s2 ? " + (s1 == s3));

		// LEarn: here .intern() method return string from String pool
		String s4 = new String("Hello").intern();
		System.out.println("s1 == s4 ? " + (s1 == s4));

		// Learn: Learn internally compiler uses StringBuilder.append to concat()
		String s5 = s1 + s2 + s3;

		// LEarn: "(.*)" is anything in REGEX
		System.out.println("s5 string matches \"Hello\":" + s5.matches("(.*)Hello"));

		String s6 = "tHellogjhfgkjfhellojkfhdfjkHello";

		Pattern p1 = Pattern.compile("Hello");

		Matcher m1 = p1.matcher(s6);
		while (m1.find()) {
			System.out.println("start =" + m1.start() + " end =" + m1.end());
		}

		String s7 = s6.substring(4);
	}

}
