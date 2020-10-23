package javaLearn.handlingException;

public class DefaultExceptionHandler {
	public static void main(String args[]) {
		// Learn: If run-time system searches all the methods on call stack and couldn’t
		// have found the appropriate handler then run-time system handover the
		// Exception Object to default exception handler , which is part of run-time
		// system. This handler prints the exception information in the following format
		// and terminates program abnormally.
		// prints "Exception in thread "xxx" Name of Exception : Description"
		int i = 100 / 0;
		System.out.println(i);
	}
}
