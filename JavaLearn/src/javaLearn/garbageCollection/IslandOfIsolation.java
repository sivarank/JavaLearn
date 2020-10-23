package javaLearn.garbageCollection;

/**
 * 
 * Island of Isolation:
 * 
 * Object 1 references Object 2 and Object 2 references Object 1. Neither Object
 * 1 nor Object 2 is referenced by any other object. That’s an island of
 * isolation.
 * 
 * Basically, an island of isolation is a group of objects that reference each
 * other but they are not referenced by any active object in the application.
 * Strictly speaking, even a single unreferenced object is an island of
 * isolation too
 *
 */
public class IslandOfIsolation {
	IslandOfIsolation t;

	public static void main(String args[]) {
		IslandOfIsolation ob1 = new IslandOfIsolation();
		IslandOfIsolation ob2 = new IslandOfIsolation();
		ob1.t = ob2;
		ob2.t = ob1;
		ob1 = null;
		ob2 = null;
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.gc();
		// System.gc();
	}

	@Override
	protected void finalize() throws Throwable {

		System.out.println("Called finalize :" + this);
	}
}
