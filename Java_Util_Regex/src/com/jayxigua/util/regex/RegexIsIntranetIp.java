package com.jayxigua.util.regex;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexIsIntranetIp {

	/**
	 * A:10.0.0.0~10.255.255.255 即10.0.0.0/8
	 * B:172.16.0.0~172.31.255.255即172.16.0.0/12 C:192.168.0.0~192.168.255.255
	 * 即192.168.0.0/16
	 * 
	 * @param ip
	 * @return
	 */
	static boolean isIntranetIp(String ip) {
		Pattern p = Pattern.compile("^10(\\.\\d{1,3}){3}");
		Matcher m = p.matcher(ip);
		if (m.matches()) {
			return true;
		}
		p = Pattern.compile("^192\\.168(\\.\\d{1,3}){2}");
		m = p.matcher(ip);
		if (m.matches()) {
			return true;
		}
		return false;
	}

	static void test02() {
		System.out.println(isIntranetIp("10.2.3.4"));
		System.out.println(isIntranetIp("192.168.3.4"));

		System.out.println(isIntranetIp("1.2.3.4"));
		System.out.println(isIntranetIp("101.2.3.4"));

		System.out.println(isIntranetIp("101.2.3.404"));
		System.out.println(isIntranetIp("1001.2.3.4"));
		System.out.println(isIntranetIp("1.2.3"));
		System.out.println(isIntranetIp("1.2.3.4.5"));

		System.out.println(isIntranetIp("101.2.3.s"));

		System.out.println(isIntranetIp(" "));
		System.out.println(isIntranetIp(""));
		System.out.println(isIntranetIp(null));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// test02();
		String[] strArray = { "1", "2", "3" };
		System.out.println(strArray);
		List<String> list = java.util.Arrays.asList(strArray);
		System.out.println(list);
	}
}
