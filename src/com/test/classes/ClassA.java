package com.test.classes;

import com.test.abstractclasses.AbstractA;

public class ClassA extends AbstractA{

	public static void main(String[] args) {
		String s = "Hello";
		String[] st = s.split("");
		for(String s1 : st) {
			System.out.println( s1);
		}
	

	}

	@Override
	public void testInterfaceA() {
		System.out.println("Hello");
		
	}

}
