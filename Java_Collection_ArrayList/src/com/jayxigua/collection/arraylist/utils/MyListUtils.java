package com.jayxigua.collection.arraylist.utils;

import java.util.List;

public class MyListUtils {

	public static <T> void printList(List<T> list) {
		System.out.println("---begin---");
		for (T t : list) {
			System.out.println(t);
		}
		System.out.println("---end---");
	}

}
