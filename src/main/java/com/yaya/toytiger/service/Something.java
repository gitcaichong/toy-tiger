package com.yaya.toytiger.service;

public class Something {
	// constructor methods
	Something() {}

	Something(String something) {
		System.out.println(something);
	}

	// static methods
	static String startsWith2(String sd) {
		System.out.println("2");
		return String.valueOf(sd.charAt(0));
	}

	// static methods
	static String startsWith(String s) {
		System.out.println("1");
		return String.valueOf(s.charAt(0));
	}

	// object methods
	String endWith(String s) {
		return String.valueOf(s.charAt(s.length()-1));
	}

	void endWith() {}
}
