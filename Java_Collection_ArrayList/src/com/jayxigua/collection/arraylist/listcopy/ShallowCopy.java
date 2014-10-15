package com.jayxigua.collection.arraylist.listcopy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.jayxigua.collection.arraylist.utils.MyListUtils;

public class ShallowCopy {

	static void constructorCopy() {
		List<Person> srcList = new ArrayList<Person>();
		Person p1 = new Person(20, "123");
		Person p2 = new Person(21, "ABC");
		Person p3 = new Person(22, "abc");
		srcList.add(p1);
		srcList.add(p2);
		srcList.add(p3);

		List<Person> destList = new ArrayList<Person>(srcList);
		MyListUtils.printList(destList);
		srcList.get(0).setAge(100);
		MyListUtils.printList(destList);
	}

	static void addAllCopy() {
		List<Person> srcList = new ArrayList<Person>();
		Person p1 = new Person(20, "123");
		Person p2 = new Person(21, "ABC");
		Person p3 = new Person(22, "abc");
		srcList.add(p1);
		srcList.add(p2);
		srcList.add(p3);
		List<Person> destList = new ArrayList<Person>();
		destList.addAll(srcList);
		MyListUtils.printList(destList);
		srcList.get(0).setAge(100);
		MyListUtils.printList(destList);
	}

	static void CollectionsCopy() {
		List<Person> srcList = new ArrayList<Person>();
		Person p1 = new Person(20, "123");
		Person p2 = new Person(21, "ABC");
		Person p3 = new Person(22, "abc");
		srcList.add(p1);
		srcList.add(p2);
		srcList.add(p3);
		List<Person> destList = new ArrayList<Person>(Arrays.asList(new Person[srcList.size()]));

		Collections.copy(destList, srcList);

		MyListUtils.printList(destList);
		srcList.get(0).setAge(100);
		MyListUtils.printList(destList);
	}

	/**
	 * 使用List实现类的构造方法
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		constructorCopy();
		addAllCopy();
		CollectionsCopy();
	}
}
