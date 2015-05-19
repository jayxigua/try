package com.jayxigua.bigdecimal;


import java.math.BigDecimal;

public class BigDecimalDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal b = new BigDecimal(-500.9);
		BigDecimal c = BigDecimal.valueOf(-500.99);
		b = b.setScale(1, BigDecimal.ROUND_DOWN);
		c = c.setScale(1, BigDecimal.ROUND_DOWN);
		System.out.println(b);
		System.out.println(c);
	}

}
