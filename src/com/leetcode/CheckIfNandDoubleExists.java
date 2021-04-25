package com.leetcode;

import java.util.stream.IntStream;

public class CheckIfNandDoubleExists {

    public boolean checkIfDoubleExists(int[] nums) {
        return IntStream.range(0,nums.length).anyMatch(i->nums[i]*2==nums[i+1] || nums[i]/2 == nums[1+1]);        
    }
	public static void main(String[] args) {
		CheckIfNandDoubleExists array= new CheckIfNandDoubleExists();
		int[] a= {1,4,5,2,3};
		System.out.println(array.checkIfDoubleExists(a));
	}

}
