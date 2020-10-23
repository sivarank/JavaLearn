package javaLearn.testRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidNumber {

	public static void main(String[] args) {

		if(Pattern.matches("^[+-]{0,1}[0-9]+", "+1")) {
			System.out.println("Valid number : "+"+1234");
		}else if(Pattern.matches("[0-9]+[\\.][0-9]+", "1.1")) {
			System.out.println("Valid number : "+"1.1");
		}

		// Test phone number with ISD code

		Pattern checkPhone = Pattern.compile("^[+][0-9]{12}");//
		System.out.println(Pattern.matches("^[+][0-9]{12}", "+919573434565"));
		System.out.println(Pattern.matches("^[+][0-9]{2}(\\s?)[0-9]{10}", "+91 9573434565"));
		System.out.println(Pattern.matches("^[+][0-9]{2}(\\s?)[0-9]{10}$", "+919573434565"));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println((Integer.MAX_VALUE*9999));
		System.out.println(Integer.SIZE);
		System.out.println(Long.SIZE);
	}

}

