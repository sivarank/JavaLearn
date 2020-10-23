package javaLearn.geeksforgeeks;

import com.google.common.base.internal.Finalizer;

public class GarbageCollection {
	public static void main(String args[]) {
		System.gc();

		System.out.println("Garbage collection started");
	}
	@Override
	protected void finalize() {

		System.out.println("Called finalize :" + this);
	}

}