package javaLearn.inputAndOutput;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DecimalAndSimpleDateFormats {
	public static void main(String args[]) {

		// this will print it upto 2 decimal places
		System.out.printf("Formatted with precison: PI = %.2f\n", Math.PI);
		double n = 2324435.3f;
		// here number is formatted from right margin and occupies a
		// width of 20 characters
		System.out.printf("Formatted to right margin: n = %20.4f\n", n);

		double num = 123.4567;

		// prints only numeric part of a floating number
		DecimalFormat ft = new DecimalFormat("####");
		System.out.println("Without fraction part: num = " + ft.format(num));

		// this will print it upto 2 decimal places
		ft = new DecimalFormat("#.##");
		System.out.println("Formatted to Give precison: num = " + ft.format(num));

		// automatically appends zero to the rightmost part of decimal
		// instead of #,we use digit 0
		ft = new DecimalFormat("#.000000");
		System.out.println("appended zeroes to right: num = " + ft.format(num));

		// automatically appends zero to the leftmost of decimal number
		// instead of #,we use digit 0
		ft = new DecimalFormat("00000.00");
		System.out.println("formatting Numeric part : num = " + ft.format(num));

		// formatting money in dollars
		double income = 23456.789;
		ft = new DecimalFormat("$###,###.##");
		System.out.println("your Formatted Dream Income : " + ft.format(income));

		// Formatting as per given pattern in the argument
		SimpleDateFormat sft = new SimpleDateFormat("dd-MM-yyyy");
		String str = sft.format(new Date());
		System.out.println("Formatted Date : " + str);

		// parsing a given String
		str = "02/18/1995";
		sft = new SimpleDateFormat("MM/dd/yyyy");
		Date date;
		try {
			date = sft.parse(str);

			// this will print the date as per parsed string
			System.out.println("Parsed Date : " + date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
