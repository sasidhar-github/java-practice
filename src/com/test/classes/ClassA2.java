package com.test.classes;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ClassA2 extends ClassA{

	public static void main(String[] args) {
		ClassA a = new ClassA2();
		a.testInterfaceA();

	}

	@Override
	public void testInterfaceA() {
		System.out.println("Class A2222222222222");
	}
	
	   public int solution(int[] A) {
		      int a = Arrays.stream(A).max().getAsInt();
		      return a;
		    }

}
