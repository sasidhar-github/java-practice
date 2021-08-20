package com.practice.interview;

public class Main {
	
	 Object message() {
		 return "Hello!";
	 }
	public static void main(String[] args) {
		System.out.println(new Main().message());
		System.out.println(new Main2().message());
	}
}
