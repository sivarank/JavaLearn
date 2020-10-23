package javaLearn.garbageCollection;

public class NumberOfTimesFinalizeCalled {
	public static void main(String[] args) {
		NumberOfTimesFinalizeCalled t1 = new NumberOfTimesFinalizeCalled();
		System.out.println(t1);
		NumberOfTimesFinalizeCalled t2 = m1(t1); // line 6
		NumberOfTimesFinalizeCalled t3 = new NumberOfTimesFinalizeCalled();
		t2 = t3; // line 8

		System.gc();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.gc();
	}

	// Learn: unlike C++, in function parameter does not create new object. temp and
	// t1 point same object
	static NumberOfTimesFinalizeCalled m1(NumberOfTimesFinalizeCalled temp) {
		System.out.println(temp);
		temp = new NumberOfTimesFinalizeCalled();
		System.out.println(temp);
		return temp;
	}

	@Override
	protected void finalize() {
		System.out.println("finalize called :" + this);
	}
}