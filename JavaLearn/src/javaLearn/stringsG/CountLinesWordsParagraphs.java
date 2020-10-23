package javaLearn.stringsG;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class CountLinesWordsParagraphs {
	public static void main(String args[]) {
		try {
			System.out.println("CWD : " + System.getProperty("user.dir"));
			FileInputStream fis = new FileInputStream("myOwnCode/javaLearn/stringsG/testText.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader bis = new BufferedReader(isr);

			int numLines = 0;
			int numWords = 0;
			int sentenceCount = 0;
			String line;
			while ((line = bis.readLine()) != null) {
				numLines++;

				// Java space delimiter
				String words[] = line.split("\\s+");
				numWords += words.length;

				// [!?.:]+ is the sentence delimiter in java
				String[] sentenceList = line.split("[!?.:]+");
				// System.out.println("sentence count = " + sentenceList.length);
				sentenceCount += sentenceList.length;
			}

			System.out.println("num of lines = " + numLines);
			System.out.println("num of words = " + numWords);
			System.out.println("num of sentences = " + sentenceCount);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
