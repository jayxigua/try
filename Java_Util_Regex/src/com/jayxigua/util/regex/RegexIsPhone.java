package com.jayxigua.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexIsPhone {
	
	static boolean isCorrectRegexIsPhone(String ip) {
		Pattern p = Pattern.compile("^010[\\d]{8}$|^02[\\d]{9}$|^0[3-9][\\d]{9,10}$|^1[3458][\\d]{9}$|^00852\\d{8}");
		Matcher m = p.matcher(ip);
		boolean b = m.matches();
		return b;
	}

	static void test01(){
		//01
		System.out.println("01");
		System.out.println(isCorrectRegexIsPhone("01012345678"));
		System.out.println(isCorrectRegexIsPhone("010123456789"));
		//02
		System.out.println("02");
		System.out.println(isCorrectRegexIsPhone("02123456789"));
		System.out.println(isCorrectRegexIsPhone("021234567890"));
		System.out.println(isCorrectRegexIsPhone("0212345678"));
		//03
		System.out.println("03");
		System.out.println(isCorrectRegexIsPhone("03123456789"));
		System.out.println(isCorrectRegexIsPhone("05123456789"));
		System.out.println(isCorrectRegexIsPhone("091234567890"));
		//04
		System.out.println("04");
		System.out.println(isCorrectRegexIsPhone("13512345678"));
		System.out.println(isCorrectRegexIsPhone("13112345678"));
		
		//05
		System.out.println("05");
		System.out.println(isCorrectRegexIsPhone("0085212345678"));
		System.out.println(isCorrectRegexIsPhone("00852123456789"));
		System.out.println(isCorrectRegexIsPhone("008521234567"));
 
		
		System.out.println(isCorrectRegexIsPhone(" "));
		System.out.println(isCorrectRegexIsPhone(""));
		System.out.println(isCorrectRegexIsPhone(null));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test01();
	}
}
