package javaLearn.testErrorAndException;

public class InvalidAgeException extends Exception {

	/**
	 * deserialization time , the code veirfy serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public InvalidAgeException(String message) {
		super(message);
	}
}
