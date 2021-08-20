package com.leetcode.sort;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeSort one = new MergeSort();
		int[] a = { 64, 34, 25, 12, 22, 11, 90 };
		one.mergeSort(a,0,a.length-1);
		for (int i : a) {
			System.out.println(i);
		}
	}

	public int[] mergeSort(int[] digits,int l,int h) {
		int mid = l+(h-l)/2;
		mergeSort(digits, l,mid-1);
		mergeSort(digits, mid+1,h);
		merge(digits,l,mid,h);
		
		return digits;
	}

	private void merge(int[] digits, int l, int mid, int h) {
		// TODO Auto-generated method stub
		
	}

}
