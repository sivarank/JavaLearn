package javaLearn.test;

class parentClassInitialization {
	{
		System.out.println("Parent class initialization");// this one prints first before child class initialization
															// block
	}
	static {
		System.out.println("Parent static blcok");
	}
}

// Driver class
class InitializationBlockVsStaticBlock extends parentClassInitialization {
	// Learn1: this static block, called only once
	static {
		System.out.println("This is static block");
	}
	// Learn2: this initialization block, called before every constructor call
	{
		System.out.println("This is Initialization Block");
	}

	// Learn: compiler silently place super() call in constructor to initialize
	// parent
	InitializationBlockVsStaticBlock() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		InitializationBlockVsStaticBlock tes = new InitializationBlockVsStaticBlock();
		tes = new InitializationBlockVsStaticBlock();
	}
}
