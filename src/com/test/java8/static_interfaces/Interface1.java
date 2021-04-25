package com.test.java8.static_interfaces;

public interface Interface1 {

	void method1(String str);

	static void log(String str) {
		System.out.println("I1 logging::" + str);
	}
}