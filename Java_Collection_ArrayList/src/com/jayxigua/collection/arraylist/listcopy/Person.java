package com.jayxigua.collection.arraylist.listcopy;

import java.io.Serializable;

class Person implements Serializable {

	private static final long serialVersionUID = 545396557703287323L;
	private int age;
	private String name;

	public Person() {
	};

	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name + "-->" + this.age;
	}

}
