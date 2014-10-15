package com.jayxigua.collection.arraylist.listcopy;

import java.util.ArrayList;
import java.util.List;

/**
 * http://www.javaweb.cc/JavaAPI1.6/java/util/ArrayList.html
 * 
 * @author jianbin.zou 2014-8-20
 */
public class ListcopyDemo {
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>() {
			private static final long serialVersionUID = 8856955353414598148L;
			{
				add("A");
				add("B");
				add("C");
				add("D");
			}
		};
		System.out.println(list);

		List<String> list1 = new ArrayList<String>();
		list1.addAll(list);
		list1.remove("A");
		System.out.println(list);
		System.out.println(list1);
	}
}
