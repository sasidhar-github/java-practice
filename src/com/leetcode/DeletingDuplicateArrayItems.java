package com.leetcode;

import java.util.stream.IntStream;

public class DeletingDuplicateArrayItems {

    public int removeElement(int[] nums, int val) {
        int[] newNum = nums;
        nums = IntStream.range(0, newNum.length).map(i->newNum[i]).filter(i->newNum[i] != val).toArray();
        return nums.length;
    }
	public static void main(String[] args) {
		DeletingDuplicateArrayItems array= new DeletingDuplicateArrayItems();
		int[] a= {3,2,2,3};
		System.out.println(	array.removeElement(a, 3));
	}
}
