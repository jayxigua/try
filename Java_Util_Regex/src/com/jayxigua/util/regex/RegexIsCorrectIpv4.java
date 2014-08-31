package com.jayxigua.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexIsCorrectIpv4 {
	
	static boolean isCorrectIpv4(String ip) {
		Pattern p = Pattern.compile("((\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])$");
		Matcher m = p.matcher(ip);
		boolean b = m.matches();
		return b;
	}

	static void test01(){
		System.out.println(isCorrectIpv4("1.2.3.4"));
		System.out.println(isCorrectIpv4("101.2.3.4"));
		
		System.out.println(isCorrectIpv4("101.2.3.404"));
		System.out.println(isCorrectIpv4("1001.2.3.4"));
		System.out.println(isCorrectIpv4("1.2.3"));
		System.out.println(isCorrectIpv4("1.2.3.4.5"));

		System.out.println(isCorrectIpv4("101.2.3.s"));
		
		System.out.println(isCorrectIpv4(" "));
		System.out.println(isCorrectIpv4(""));
		System.out.println(isCorrectIpv4(null));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test01();
	}
}
