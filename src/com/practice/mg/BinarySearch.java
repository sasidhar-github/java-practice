package com.practice.mg;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 9, 34, 67, 103, 440 };
		int x = 40;
		System.out.println(binarySearch(arr, 0, arr.length - 1, x)>0?"Element Present":"Element Not Present");
	}

	private static int binarySearch(int[] arr, int low, int high, int x) {
		int mid = low + (high - low) / 2;
		int val = arr[mid];
		if (low <= high) {
			if (val == x) {
				return mid;
			} else if (val > x) {
				high = mid - 1;
				return binarySearch(arr, low, high, x);
			} else {
				low = mid + 1;
				return binarySearch(arr, low, high, x);
			}
		}
		return -1;
	}

}
