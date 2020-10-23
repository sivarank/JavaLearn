package javaLearn.construct;

public class StaticAnsNonStaticFinalVariables {
	final int i;
	static final int j;
	static {
		// Learn: static variable can be initialized in static block
		j = 10;
	}

	public StaticAnsNonStaticFinalVariables() {
		// Learn: constructor can set non-static final value
		i = 5;
	}

	public static void main(String args[]) {
		StaticAnsNonStaticFinalVariables tes = new StaticAnsNonStaticFinalVariables();
		System.out.println(tes.i);
		System.out.println(j);
	}
}
