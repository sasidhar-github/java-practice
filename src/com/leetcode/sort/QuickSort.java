package com.leetcode.sort;

import java.util.stream.IntStream;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort one = new QuickSort();
		int[] a = { 64, 34, 25, 12, 22, 11, 90 };
		one.quickSort(a,0,a.length-1);
		IntStream.range(0, a.length).forEach(i->System.out.println(a[i]));
	}
	
	private int[] quickSort(int[] digits, int low, int high) {
		// TODO Auto-generated method stub
		if(low < high) {
			int partIndex = partition(digits,low,high);
			quickSort(digits, low, partIndex-1);
			quickSort(digits, partIndex+1,high);
		}
		return digits;
	}

	private int partition(int[] digits, int low, int high) {
	          int pivot = digits[high];
	          int i = low-1;
	          for(int j=low;j<high;j++) {
	        	  if(digits[j] < pivot) {
	        		 i++;
	        		swap(digits,i,j);  
	        	  }	        	  
	          }
	          swap(digits,i+1,high);
		return i+1;
	}

	private void swap(int[] digits, int i, int j) {
		int temp = digits[i];
		digits[i] = digits[j];
		digits[j] = temp;		
	}

}
