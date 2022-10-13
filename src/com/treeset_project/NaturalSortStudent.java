package com.treeset_project;

import java.util.TreeSet;

public class NaturalSortStudent {

	public static void main(String[] args) {
		Student s1 = new Student(76, "murli", "Civil");
		Student s2 = new Student(56, "vijay", "Mech");
		Student s3 = new Student(87, "sham", "E & TC");
		Student s4 = new Student(33, "Aakash", "IT");

		TreeSet t = new TreeSet();
		t.add(s4);
		t.add(s3);
		t.add(s1);
		t.add(s2);
		System.out.println(t);
	}
}
