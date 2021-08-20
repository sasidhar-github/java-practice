package com.practice.interview;

public class MainSubString {

	public static void main(String[] args) {
		String str = "Hello World!";
		str = str.substring(6, 12)+ str.substring(12, 6);
		System.out.println("The str is "+str);
	}
}
