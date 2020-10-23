package javaLearn.inputAndOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//https://www.geeksforgeeks.org/difference-between-scanner-and-bufferreader-class-in-java/
public class DifferentWaysOfReeadingInput {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		// Learn1: scanner also has NextFloat() apis
		while (scan.hasNextInt()) {
			System.out.println(scan.nextInt());
		}
		scan.close();

		// Learn2: BufferReader
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("BufferedReadetr :" + buf.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Learn3: System.console().readLine(). but we need to run the program from
		// command line
		System.out.println("System.console.read :" + System.console().readLine());
	}
}
