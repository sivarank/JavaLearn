package javaLearn.inputAndOutput;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		// Learn1: scanner also has NextFloat() apis
		while (scan.hasNextInt()) {
			System.out.println(scan.nextInt());
		}
		scan.close();
	}
}
