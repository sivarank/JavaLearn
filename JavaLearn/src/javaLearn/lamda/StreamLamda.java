package javaLearn.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class StreamLamda {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("a", "a", 1), new Person("b", "b", 2), new Person("c", "c1", 2), new Person("c", "c2", 2));

		persons.stream()
		.filter(p->p.getLastName().startsWith("c"))
		.forEach(x->System.out.println(x.getFirstName()));

		long count = persons.parallelStream()
		.filter(p->p.getLastName().startsWith("c"))
		.count();
		System.out.println(count);
	}
}

