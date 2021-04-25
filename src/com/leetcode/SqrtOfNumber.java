package com.leetcode;

public class SqrtOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double number = 16;
		double root;
		root = squareRoot(number);
		System.out.println("Number : "+number);
		System.out.println("Square Root : "+root);
	}

	private static double square(double number) {
		double t;
		double squareroot = number / 2;
		do 
		{
		t = squareroot;
		squareroot = (t + (number / t)) / 2;
		}
		 while ((t - squareroot) != 0);
		return squareroot;
	}
	
	private static double squareRoot(double number) {
         int result = 1;
         int val =1;
         while(result <=number) {
        	 val++;
        	 result = val*val;
         }
		return val-1;
	}

}
