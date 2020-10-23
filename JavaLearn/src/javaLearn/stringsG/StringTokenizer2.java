package javaLearn.stringsG;

import java.util.StringTokenizer;

public class StringTokenizer2 {
	public static void main(String[] args) {
		StringTokenizer tokens = new StringTokenizer("SIVA SAI");
		System.out.println("\n\nWithout delim");
		while (tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}
		System.out.println("\n\nWith delim");
		tokens = new StringTokenizer("SIVA SAI$RAP", " $&");
		while (tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}

		System.out.println("\n\nConsider delim as a token");
		tokens = new StringTokenizer("SIVA SAI$RAP", " $&", true);
		while (tokens.hasMoreTokens()) {
			System.out.println(tokens.nextToken());
		}
	}
}
