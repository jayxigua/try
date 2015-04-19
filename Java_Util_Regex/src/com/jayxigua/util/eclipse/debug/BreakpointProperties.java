package com.jayxigua.util.eclipse.debug;

import java.util.HashMap;
import java.util.Map;

public class BreakpointProperties {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int change = 10;
		for (int i = 0; i < 9; i++) {
			map.put(i, change);
			System.out.println(i);
			System.out.println(change);
		}
		System.out.println(map.size());
		fun01();
	}

	public static void fun01() {
		fun02();
		System.out.println("fun 01");
	}

	public static void fun02() {
		System.out.println("fun 02");
	}
}
