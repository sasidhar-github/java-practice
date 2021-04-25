package com.leetcode;

public class SubArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,7,5};
		int sum = 12;
		System.out.println(SubArray.subArray(arr, sum));

	}

	static int subArray(int arr[], int sum) {
		int len = arr.length, start = 0, curr_sum = arr[0];
		for (int i = 1; i <= len; i++) {
			while (curr_sum > sum && start <i - 1) {
				curr_sum = curr_sum - arr[start];
				start++;
			}
			if (curr_sum == sum) {
				return 1;
			}
			if(i<len)
			curr_sum += arr[i];
		}
		return 0;
	}
}
