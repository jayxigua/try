package com.jayxigua.collection.arraylist.listcopy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.jayxigua.collection.arraylist.utils.MyListUtils;

public class DeepCopy {

	public static <T> List<T> deepCopy(List<T> src) throws IOException, ClassNotFoundException {
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		ObjectOutputStream out = new ObjectOutputStream(byteOut);
		out.writeObject(src);

		ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
		ObjectInputStream in = new ObjectInputStream(byteIn);
		@SuppressWarnings("unchecked")
		List<T> dest = (List<T>) in.readObject();
		return dest;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		List<Person> srcList = new ArrayList<Person>();
		Person p1 = new Person(20, "123");
		Person p2 = new Person(21, "ABC");
		Person p3 = new Person(22, "abc");
		srcList.add(p1);
		srcList.add(p2);
		srcList.add(p3);

		List<Person> destList = deepCopy(srcList);
		MyListUtils.printList(destList);
		srcList.get(0).setAge(100);
		MyListUtils.printList(destList);
	}
}
