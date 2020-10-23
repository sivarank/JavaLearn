package javaLearn.garbageCollection;

public class TestGC {
	public static void main(String args[]) {
		TestGC t1 = new TestGC();
		TestGC t2 = new TestGC();
		t1 = null;

		// String arr = new String(1000000000);
		Integer[] arr = new Integer[311111111];
		arr = null;
		// System.gc();
		t2 = null;
		System.out.println("before second gc() ");
		System.gc();
		try {
			Thread.sleep(1111111);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	// finalize method is called on object once
	// before garbage collecting it
	protected void finalize() throws Throwable {
		System.out.println("Garbage collector called 1");
		System.out.println("Object garbage collected : " + this);
		// LEARN:
		// When Garbage Collector calls finalize() method on an object, it ignores all
		// the exceptions raised in the method and program will terminate normally.

		int i = 10 / 0;
	}
}
