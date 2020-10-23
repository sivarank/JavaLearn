package javaLearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie implements Comparable<Movie>, Comparator<Movie>{
	String name;
	
	public Movie(String name1) {
		name = name1;
	}
	Movie(){
	}

	@Override
	public int compareTo(Movie o) {
		System.out.println(o.name);
		return this.name.compareToIgnoreCase(o.name);
	}
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public int compare(Movie o1, Movie o2) {
		System.out.println("Comparator : "+o1+" : "+o2);
		return o1.name.compareTo(o2.name);
	}
}

class NewMovie{
	String name;
	public NewMovie(String name1) {
		name = name1;
	}
	@Override
	public String toString() {
		return name;
	}
}

public class TestComparatorVsComparable {

	public static void main(String[] args) {

		List<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("RERT"));
		list.add(new Movie("AD"));
		//LEarn: below sort needs comparable
		Collections.sort(list);
		System.out.println(list);
		//Learn: below sort method need comparator 
		list.sort(new Movie());
		System.out.println(list);
		
		//Learn: below list must implement comparable to support Collecitons.sort()
		List<NewMovie> list1 = new ArrayList<NewMovie>();
		list1.add(new NewMovie("9123232")); 
		list1.add(new NewMovie("5657"));
		Collections.sort(list1, new Comparator<NewMovie>(){
			public int compare(NewMovie m1, NewMovie m2) {
				return m1.name.compareTo(m2.name);
			}
		});
		System.out.println(list1);
		//Lamda functions
		Collections.sort(list1, (a,b) -> b.name.compareTo(a.name));
		System.out.println(list1);
		//Collections.synchronizedCollection(list1);
	}

}
