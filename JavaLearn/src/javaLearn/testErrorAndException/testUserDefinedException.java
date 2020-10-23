package javaLearn.testErrorAndException;

public class testUserDefinedException {

	public static void main(String[] args) {
		try {
			validateAge(1);
			validateAge(0);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static boolean validateAge(int age) throws InvalidAgeException {
		if (age <= 0) {
			throw new InvalidAgeException("Invalid age entered");
		} else {
			return true;
		}
	}

}
