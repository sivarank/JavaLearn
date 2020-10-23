package javaLearn.handlingException;

public class ChainedException {
	public static void main(String args[]) {
		try {
			NumberFormatException nfe = new NumberFormatException("top exception");

			nfe.initCause(new ArithmeticException("cause "));

			throw new IllegalArgumentException("top", new ArithmeticException("cause "));
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println(ex.getCause());
			ex.printStackTrace();
		}
	}
}
