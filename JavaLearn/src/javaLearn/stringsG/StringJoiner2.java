package javaLearn.stringsG;

import java.util.StringJoiner;

public class StringJoiner2 {
	public static void main(String[] args) {
		String tokens[] = { "a", "b", "c", "d" };

		StringJoiner sj1 = new StringJoiner(",", "START", "END");
		sj1.setEmptyValue("Empty");
		System.out.println(sj1);

		sj1.add(tokens[0]).add(tokens[1]);
		System.out.println(sj1);

		StringJoiner sj2 = new StringJoiner(":", "S", "E");
		sj2.add(tokens[2]).add(tokens[3]);
		sj1.merge(sj2);
		System.out.println(sj1);
	}
}
