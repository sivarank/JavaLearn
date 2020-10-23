package javaLearn.test;

//Learn 1: break LABEL

public class BreakLabel {
	public static void main(java.lang.String args[]) {
		{
			boolean flag = true;
			first: {
				System.out.println("first block");
				second: {
					System.out.println("before break");
					if (flag)
						break second;
					thrird: {
						System.out.println("Third");
					}
				}
				System.out.println("first block exit");
			}
		}
	}
}
