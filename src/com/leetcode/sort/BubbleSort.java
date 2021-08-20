package com.leetcode.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort one = new BubbleSort();
		int[] a = { 64, 34, 25, 12, 22, 11, 90 };
		for (int i : one.bubbleSort(a)) {
			System.out.println(i);
		}
	}

	public int[] bubbleSort(int[] digits) {
		int n = digits.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (digits[j] > digits[j+1]) {
					int temp = digits[j];
					digits[j] = digits[j+1];
					digits[j+1] = temp;
				}
			}
		}
		return digits;
	}

}
