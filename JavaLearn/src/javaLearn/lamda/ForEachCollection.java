package javaLearn.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class ForEachCollection {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("a", "a", 1), new Person("b", "b", 2), new Person("c", "c1", 2), new Person("c", "c2", 2));

		
		//print persons name starts with "c"
		for(Person p : persons) {
			if(p.getLastName().startsWith("c")) {
				System.out.println(p);				
			}
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		persons.forEach((p)->System.out.println(p));// Lamda 
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		persons.forEach(System.out::println);// Method reference 

	}
	static void printConditonally(List<Person> persons, Predicate<Person> prd) {
		for(Person p : persons) {
			if(prd.test(p)) {
				System.out.println(p);
			}
		}
	}
}

