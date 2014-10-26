package com.jayxigua.object_oriented.overwrite;

/**
 * 一级子类和基类包含的内容一样
 **/

public class SuperClass extends Base {
	// 静态变量、静态块执行顺序，按书写先后顺序
	public static int a1 = getSuperStaticNumber();
	public int b1 = getSuperInstanceNumber();

	public SuperClass() {
		System.out.println("Init SuperClass" + this.b1);
	}

	static {
		System.out.println("Static Init SuperClass" + a1);
	}

	public static int getSuperStaticNumber() {
		System.out.println("Static member init");
		return 100;
	}

	public int getSuperInstanceNumber() {
		System.out.println("Instance member init");
		return 200;
	}
}
