package javaLearn.AbstractAndInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	String name;

	public Student(String nam) {
		name = nam;
	}

	// LEarn: override toString to print Student name
	@Override
	public String toString() {
		return name;
	}
}

class SortStudent implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		// returns -ve o1> O2. +ve O1 < O2
		System.out.println(o1.name.compareToIgnoreCase(o2.name));
		return o1.name.compareToIgnoreCase(o2.name);
	}
}

public class InterfaceComparator {
	public static void main(String args[]) {
		Student[] students = { new Student("SIVA"), new Student("SSAI"), new Student("APPA") };
		ArrayList<Student> studentList = new ArrayList<Student>();
		for (Student student : students) {
			studentList.add(student);
		}
		System.out.println(studentList.toString());
		// Learn: below sort uses "Merge" sort
		Collections.sort(studentList, new SortStudent());
		System.out.println(studentList.toString());
	}
}
