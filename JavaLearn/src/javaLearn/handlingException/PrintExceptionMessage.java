package javaLearn.handlingException;

public class PrintExceptionMessage {
	public static void main(String args[]) {
		try {
			int i = 100 / 0;
		} catch (Exception ex) {
			System.out.println("11111111 : " + ex);
			// Learn: prints exception type + exception message
			System.out.println("22222222 : " + ex.toString());
			// Learn: ex.getmessage() only prints exception message not exception type
			System.out.println("33333333 : " + ex.getMessage());

			// Learn: below thing prints "Infinity"
			System.out.println("guess float no / 0 =" + (1.0 / 0));
			// Learn: default top exception handler handles it
			int j = 100 / 0;
		}
	}
}
