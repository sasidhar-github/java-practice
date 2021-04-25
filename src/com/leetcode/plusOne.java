package com.leetcode;

public class plusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		plusOne one = new plusOne();
		int[] a = {2,9,7,9};
		for (int i : one.plusOneMethod(a)) {
		System.out.println(i);
		}
	}

	public int[] plusOneMethod(int[] digits) {
	       int j = digits.length;
			//to solve when the digit needs to add is 9
	        while(digits[j-1] == 9){
	            digits[j-1] =0;
				//to solve when all the digits are 9
	            if(j == 1){
	                int[] finalDigits = new int[digits.length+1];
	                finalDigits[0] = 1;
	                return finalDigits;
	            }
	            j = j-1;
	        }
	        digits[j-1]++;
	        return digits;
	}
}
