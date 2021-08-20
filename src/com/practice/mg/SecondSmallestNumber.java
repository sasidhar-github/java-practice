package com.practice.mg;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		int A[] = {10, 3, 6, 9, 2, 4, 15, 23};int k=2;
        System.out.println(solution(A,k));

	}

	private static int solution(int[] a,int k) {
		// TODO Auto-generated method stub
		Arrays.sort(a);
		return a[k-1];
	}

}
