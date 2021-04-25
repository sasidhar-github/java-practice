package com.test.java8.static_interfaces;

public interface Interface2 {

	void method2();
	
	static void log(String str){
		System.out.println("I2 logging::"+str);
	}
}