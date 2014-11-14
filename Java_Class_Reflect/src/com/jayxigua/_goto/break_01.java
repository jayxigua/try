package com.jayxigua._goto;

public class break_01 {

	public static void main(String[] args) {
		break_01 test = new break_01();
		test.testLoopOne();
		System.out.println();
		System.out.println();
		test.testLoopTwo();

	}

	/**
	 * 使用标志控制
	 */
	public void testLoopOne() {
		HH: for (int i = 0; i < 10; i++) {
			System.out.println("i的数值是：" + i);
			for (int k = 0; k < 10; k++) {
				System.out.println("k的数值是：" + k);
				if (k == 6)
//					break HH;
					continue HH;
			}
		}
		System.out.println("跳出所有循环......");
	}

	/**
	 * 使用标旗量控制
	 */
	public void testLoopTwo() {
		int tmp = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("i的数值是::::::" + i);
			for (int k = 0; k < 10; k++) {
				System.out.println("k的数值是::::::" + k);
				tmp = k;
				if (k == 6)
					break;
			}
			if (tmp == 6)
				break;
		}
		System.out.println("跳出所有循环......");
	}

}