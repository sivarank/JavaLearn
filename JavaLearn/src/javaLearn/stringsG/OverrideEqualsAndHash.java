package javaLearn.stringsG;
// https://www.geeksforgeeks.org/overriding-equals-method-in-java/

class TestEquals {
	int i;

	public TestEquals(int arg) {
		i = arg;
	}

	// Learn 2: equals method overrided
	@Override
	public boolean equals(final Object obj) {
		System.out.println("Equals called");
		if (obj instanceof TestEquals) {
			TestEquals tes = (TestEquals) obj;
			return i == tes.i;
		}
		return false;
	}

	@Override
	// Learn1: Created object name is "test.TestEquals@70"
	public int hashCode() {
		return i * 10 + 12;
	}
}

// Driver class
class OverrideEqualsAndHash {
	public static void main(String[] args) {
		TestEquals obj1 = new TestEquals(10);
		TestEquals obj2 = new TestEquals(10);
		System.out.println("obj1 = " + obj1 + " , obj2 =" + obj2);
		if (obj1 == obj2) {
			System.out.println(true +"fgf");
		}
		System.out.println(obj1.equals(obj2));
	}
}
