package com.leetcode;

public class TwoDimentional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDimentional one = new TwoDimentional();
		int[][] a = { { 0, 1, 8 }, { 3, 12, 4 }, { 2, 5, 9 } };
		int[][] b = new int[a.length][a[0].length];
		a=one.print(a, b);
		System.out.println(b +" "+a);
	}

	public int[][] print(int[][] a, int[][] b) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				b[i][j] = a[j][i];
			}
		}

		for (int i = 0; i < b.length; i++) {
			int start = 0;
			int end = b.length - 1;
			while (start < end) {
				int temp = b[i][start];
				b[i][start] = b[i][end];
				b[i][end] = temp;
				start++;
				end--;
			}
		}
	return	a = b;
	}

}
