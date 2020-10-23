package javaLearn.questions;

//Learn: outer class can't be Static. get  error "Illegal modifier for the class NestedClassNonStaticVariable; 
//only public, abstract & final are permitted"
public class NestedClassNonStaticVariable {
	class TestNested {
		// LEarn: error"The field tes cannot be declared static in a non-static inner
		// type, unless initialized with a constant expression"
		 //public static String tes1 = "kgkfgj";
		public final static String tes = "kgkfgj";
	}

	public static void main(String[] args) {
		System.out.println(Double.MIN_VALUE > 0.0d);
		System.out.println(Float.MIN_VALUE > 0.0f);

	}

}

