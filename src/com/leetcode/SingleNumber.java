package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

	   public int singleNumber(int[] nums) {
	        Map<Integer,Integer> map = new HashMap<>();
             int num =0;
	        for(int i=0;i<nums.length;i++){
	           Integer val = map.put(i,map.getOrDefault(nums[i],0));
	            if(val == null){
	                num = nums[i];
	            }
	        }
	        return num;
	    }
	   
	public static void main(String[] args) {
		SingleNumber array= new SingleNumber();
		int[] a= {0,2,5,7,6};
		System.out.println(array.singleNumber(a));
	}

}
