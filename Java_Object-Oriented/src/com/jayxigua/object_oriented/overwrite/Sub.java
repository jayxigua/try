package com.jayxigua.object_oriented.overwrite;

/**
 * 二级子类为测试该代码的驱动类
 */
public class Sub extends SuperClass {
	public static int a = 1000;
	public int b = 2000;

	public static int a2 = getStaticNumber();
	public int b2 = getInstanceNumber();

	public Sub() {
		System.out.println("Init SubClass " + this.b2);
	}

	public static int getStaticNumber() {
		System.out.println("Static member init Sub");
		return 1000;
	}

	public int getInstanceNumber() {
		System.out.println("Instance member init Sub");
		return 2000;
	}

	static {
		System.out.println("Static Init " + a2);
	}

	public void getA() {
		System.out.println("a=" + a);
	}

	/**
	 * 程序入口,main
	 * 
	 * */
	public static void main(String args[]) {
		Base b = new Sub();
		System.out.println(b.a);
		b.getA();
	}
}