package com.jayxigua.util.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexIp {
	static boolean isCorrectIpv4(String ip) {
		Pattern p = Pattern.compile("((\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])$");
		Matcher m = p.matcher(ip);
		boolean b = m.matches();
		return b;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
}
