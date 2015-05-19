package com.jayxigua.collection.arraylist.classcopy;

import java.util.ArrayList;
import java.util.List;

public class ClassCopy {

	public static void fun(List<Person> persons, Person p, int number) {
		number = 10;
		for (int i = 0; i < 2; i++) {
			Person p1 = new Person(i, "name " + i);
			persons.add(p1);
			if (i == 0) {
				p = p1;
			}
		}
	}

	public static void main(String[] args) {
		Person p = new Person(100, "name 100");
		List<Person> persons = new ArrayList<Person>();
		int number = 5;
		fun(persons, p, number);
		System.out.println(persons);
		System.out.println(p);
		System.out.println(number);
	}
}
