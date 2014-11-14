package com.jayxigua.object_oriented.overwrite;

public class Base {
	public static int a = 10;
	public int b = 20;
	static {
		System.out.println("Static Init Base " + a);
		// System.out.println("Null Init " + b);
	}

	public Base() {
		System.out.println("Init Base " + this.b);
	}

	public void getA() {
		System.out.println("a=" + a);
	}
}
