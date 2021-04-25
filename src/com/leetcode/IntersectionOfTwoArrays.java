package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntersectionOfTwoArrays one = new IntersectionOfTwoArrays();
		int[] a = { 1, 2, 2, 4 };
		int[] b = { 2,2 };
		for (int i : one.intersect(a, b)) {
			System.out.println(i);
		}
	}

	public int[] intersect(int[] nums1, int[] nums2) {
//		Map<Integer, Long> map = Arrays.stream(nums1).boxed()
//				.collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		if(nums1.length < nums2.length) {
			int[] temp = nums1;
			nums1 = nums2;
			nums2 = nums1;
		}
		List<Integer> list = Arrays.stream(nums1).boxed().collect(Collectors.toList());
		List<Integer> res = new ArrayList<>();
		for (int number : nums2) {
			if (list.contains(number)) {
				res.add(number);
				//list.remove(number+"");
			}
		}
		return res.stream().mapToInt(i -> i).toArray();
	}
}
