package javaLearn.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LamdaLearn {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("a", "a", 1), new Person("b", "b", 2), new Person("c", "c1", 2), new Person("c", "c2", 2));
		
		//Sort persons by last name
		Collections.sort(persons, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		//print persons name starts with "c"
		for(Person p : persons) {
			if(p.getLastName().startsWith("c")) {
				System.out.println(p);				
			}
		}
		System.out.println("\n++++++++++++++++++++++++\n");
		
		//****************************************************
		persons = Arrays.asList(new Person("a", "a", 1), new Person("b", "b", 2), new Person("c", "c2", 2), new Person("c", "c1", 2));
		
		//Sort persons by last name
		Collections.sort(persons, (a,b)->a.getLastName().compareTo(b.getLastName()));
		printConditonally(persons, p->true);
		//print persons name starts with "c"
		printConditonally(persons, p->p.getLastName().startsWith("c"));

	}
	static void printConditonally(List<Person> persons, Condition cnd) {
		for(Person p : persons) {
			if(cnd.test(p)) {
				System.out.println(p);
			}
		}
	}
}



interface Condition {
	boolean test(Person p);
}



class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	
	
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
	
	
	
}