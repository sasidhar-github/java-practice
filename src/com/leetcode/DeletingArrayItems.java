package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeletingArrayItems {

    public int removeDupElement(int[] nums) {
       // Arrays.sort(newNum);
        //nums = IntStream.range(0, newNum.length).map(i->newNum[i]).distinct().toArray();
        
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }  
        nums = set.stream().mapToInt(a->a.intValue()).toArray();
        return set.size();
    }
	public static void main(String[] args) {
		DeletingArrayItems array= new DeletingArrayItems();
		int[] a= {1,1,2};
		array.removeDupElement(a);
		System.out.println(Arrays.toString(a));
	}
}
