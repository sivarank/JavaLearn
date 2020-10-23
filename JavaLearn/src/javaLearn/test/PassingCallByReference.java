package javaLearn.test;

class PassingCallByReference {

	// swap() doesn't swap c1 and c2
	public static void swap(Car c1, Car c2) {
		Car temp = c1;
		c1 = c2;
		c2 = temp;
	}

	public static void swap1(Car c1, Car c2) {
		Integer temp = c1.no;
		c1.no = c2.no;
		c2.no = temp;

		temp = c1.model;
		c1.model = c2.model;
		c2.model = temp;
	}

	public static void main(String args[]) {
		Car c1 = new Car(101, 1);
		Car c2 = new Car(202, 2);
		swap(c1, c2);
		c1.print();
		c2.print();
		swap1(c1, c2);
		c1.print();
		c2.print();
	}
}

// A car with number and name
class Car {
	Integer model, no;

	// Constructor
	Car(int model, int no) {
		this.model = model;
		this.no = no;
	}

	// Utility method to print Car
	void print() {
		System.out.println("no = " + no + ", model = " + model);
	}
}
