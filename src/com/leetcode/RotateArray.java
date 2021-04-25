package com.leetcode;

import java.util.stream.IntStream;

public class RotateArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,6,7,8};
		int pos = 3;
		IntStream.of(rotateArray(arr, pos)).forEach(i->System.out.println(i));

	}

	static int[] rotateArray(int arr[], int pos) {
		reverseArray(arr,0,arr.length-pos-1);
		reverseArray(arr,arr.length-pos,arr.length-1);
		reverseArray(arr, 0, arr.length-1);
		return arr;
	}

	private static int[] reverseArray(int[] arr, int start,int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		return arr;
	}
}
