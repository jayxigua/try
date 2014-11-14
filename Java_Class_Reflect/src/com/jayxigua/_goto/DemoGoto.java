package com.jayxigua._goto;

public class DemoGoto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		inner: for (int i = 0; i < 3; i++) {
			System.out.println("iiii===>" + i);
			for (int j = 0; j < 5; j++) {
				if (j == 1){
					continue inner;
//					break inner;
				}
				System.out.println("j===>" + j);
			}
		}

	}

}
