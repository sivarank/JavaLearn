package javaLearn.AbstractAndInterface;

class Test123 {
	protected interface Yes {
		void show();
	}
}

class Testing implements Test123.Yes {
	public void show() {
		System.out.println("show method of interface");
	}
}

class NestedInterface {
	public static void main(String[] args) {
		Test123.Yes obj;
		Testing t = new Testing();
		obj = t;
		obj.show();
	}
}