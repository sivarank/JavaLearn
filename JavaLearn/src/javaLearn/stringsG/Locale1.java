package javaLearn.stringsG;

import java.util.Locale;

public class Locale1 {
	public static void main(String[] args) {
		String s = "I Know YOI Bui You Don't Know ME.";

		// Locales with the language "tr" for TURKISH
		// "en" for ENGLISH is created
		Locale hindi = new Locale("hi", "IN");
		Locale ENGLISH = Locale.forLanguageTag("en");

		// converting string s to lowercase letter
		// using Hindi and ENGLISH language
		String gfg2 = s.toLowerCase(hindi);
		String gfg3 = s.toLowerCase(ENGLISH);
		System.out.println(gfg2);
		System.out.println(gfg3);

		System.out.println(hindi.getCountry());
	}
}
