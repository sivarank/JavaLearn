package javaLearn.stringsG;

//
public class StringBuilderVsStringBuffer {
	// Concatenates to String
	public static void concat1(String s1) {
		// Learn2: below new String literal got generated
		s1 = s1 + "forgeeks1111111111111111111111111";
		System.out.println(s1.hashCode());
	}

	// Concatenates to StringBuilder
	public static void concat2(StringBuilder s2) {
		s2.append("forgeeks1111111111111111111111111");
	}

	// Concatenates to StringBuffer
	public static void concat3(StringBuffer s3) {
		s3.append("forgeeks1111111111111111111111111");
	}

	public static void main(String[] args) {
		// Learn1:String is immutable(we can't change string value). when String value
		// won't change through out program then we can use String. after append String
		// hashcode value changes to prove immutable.

		// Learn 8: String does not have reverse() method but below two has the method
		String s1 = "Geeks";
		System.out.println(s1.hashCode());
		concat1(s1); // s1 is not changed
		System.out.println("String: " + s1 + "\n\n");

		// Leanr3: String builder and buffer, both are same except String Buffer is
		// thread safe since it uses Synchronized methods.

		// Learn4: initial String builder capacity = string len + 16. And it size grow
		// by
		// 2*MinimumCapacity + 2; MinimumCapacity = currentLength + append chars length.
		// But "new StringBuilder(20)" sets capacity to 20 no addition of 16

		// Learn5: StingBuilder Super class AbstractStringBuilder . And StringBuffer
		// super class also AbstractStringBuilder.
		StringBuilder s2 = new StringBuilder("Geeks");
		System.out.println(s2.hashCode());
		concat2(s2); // s2 is changed
		System.out.println("StringBuilder: " + s2);
		System.out.println("s2 len =" + s2.length() + " , s2 capacity =" + s2.capacity());
		System.out.println(s2.hashCode());
		System.out.println(s2.getClass().getSuperclass() + "\n\n");

		StringBuffer s3 = new StringBuffer("Geeks");
		System.out.println(s3.hashCode());
		concat3(s3); // s3 is changed
		System.out.println("StringBuffer: " + s3);
		System.out.println("s3 len =" + s3.length() + " , s3 capacity =" + s3.capacity());
		System.out.println(s3.hashCode());
		System.out.println(s3.getClass().getSuperclass() + "\n\n");

		// Learn6: there is separate String pool in heap are, "Geeks" string literal
		// added to pool if it is not there already.if you use "new String("Geeks")", it
		// will be created in heap area (not in string pool)
		String s4 = new String("Immutable");// Learn7: still s4 is immutable no matter how we create it. Strings are
											// immutable. String class does not have any modify methods.
		// https://stackoverflow.com/questions/21375659/is-new-string-immutable-as-well
		System.out.println(s4.hashCode());
		s4 += 1;
		System.out.println(s4.hashCode());
		// Learn7 :String does not have capacity() method
		// System.out.println("s4 len =" + s4.length() + " , s4 capacity =" +
		// s4.capacity());
		System.out.println("s4 len =" + s4.length());
		System.out.println(s4);
	}
}
