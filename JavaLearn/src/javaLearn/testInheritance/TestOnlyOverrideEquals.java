package javaLearn.testInheritance;

import java.util.HashMap;
import java.util.Map;

class Employee {
	int age;
	String name;

	public Employee(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public int hashCode() {
		System.out.println(this);
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in Equals =" + this);
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + "]";
	}

}

public class TestOnlyOverrideEquals {

	static Map<Employee, String> hashMap = new HashMap<>();

	public static void main(String[] args) {
		// Learn: ""\\u000d"" is new line character. below line print "TEsting
		// commentingj"
		// \u000d
		System.out.println("TEsting commentingj");
		// \\n System.out.println("TEsting commentingj");
		Employee emp1 = new Employee(1, "SIVA");
		Employee emp2 = new Employee(2, "SAI");
		Employee emp3 = new Employee(3, "VENKATA");

		hashMap.put(emp1, "1111111111111");
		hashMap.put(emp2, "2222222222222");
		hashMap.put(emp3, "3333333333333");

		Employee lookUp = new Employee(1, "SIVA");

		System.out.println(hashMap.get(lookUp));
	}

}
