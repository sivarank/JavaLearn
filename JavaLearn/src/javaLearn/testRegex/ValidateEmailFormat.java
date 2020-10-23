package javaLearn.testRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmailFormat {

	public static void main(String[] args) {

		// Learn: validate email id
		Pattern p1 = Pattern.compile("^([A-Za-z0-9_\\+\\.]+)@([A-Za-z0-9_\\\\+\\\\.]+)\\.([A-Za-z]{2,5})$");
		// Pattern p1 =
		// Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
		Matcher m1 = p1.matcher("sivarank@gmail.com");
		while (m1.find()) {
			System.out.println("start =" + m1.start() + " end =" + m1.end());
		}

		// LEarn2: validate variable

		Pattern p2 = Pattern.compile("^([A-Za-z]+)");
		Matcher m2 = p2.matcher("4TRER");
		System.out.println(" 4TRER is avariable :" + m2.find());

		Matcher m3 = p2.matcher("TRER");
		System.out.println(" TRER is avariable :" + m3.find());

		// Find no of words in setnence

		// Mistake: \\w matches any word character alpha-numeric
		Pattern pw = Pattern.compile("\\s+");
		Matcher mw = pw.matcher(" jdkfhjdf kjhfjkdf kjhfkjds ".trim());
		int wordCount = 0;
		while (mw.find()) {
			wordCount++;
		}
		System.out.println(" jdkfhjdf kjhfjkdf kjhfkjds  :" + (wordCount + 1));

		// Learn: Pattenr compile with flags

		Pattern casePattern = Pattern.compile("ge+", Pattern.CASE_INSENSITIVE);
		Matcher mc = casePattern.matcher("GEEE");
		System.out.println(mc.find());

		// Test phone number with ISD code

		Pattern checkPhone = Pattern.compile("^[+][0-9]{12}");//
		System.out.println(Pattern.matches("^[+][0-9]{12}", "+919573434565"));
		System.out.println(Pattern.matches("^[+][0-9]{2}(\\s?)[0-9]{10}", "+91 9573434565"));
		System.out.println(Pattern.matches("^[+][0-9]{2}(\\s?)[0-9]{10}$", "+919573434565"));
	}

}
