package com.leetcode;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveZeros one = new MoveZeros();
		int[] a = { 0, 1, 0, 3, 12 };
		for (int i : one.moveZeroes(a)) {
			System.out.println(i);
		}
	}

	public int[] moveZeroes(int[] digits) {
		int j = 0;
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] != 0) {
				digits[j] = digits[i];
				j++;
			}
		}
		while (digits.length > j) {
			digits[j] = 0;
			j++;
		}
		return digits;
	}

}
