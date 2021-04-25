package com.leetcode;

import java.util.Arrays;

public class MergeArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) { 
       for(int i=m;i<m+n;i++){
             nums1[i] = nums2[i-m];        
       } 
      Arrays.sort(nums1); 
    }
	public static void main(String[] args) {
		MergeArrays array= new MergeArrays();
		int[] a= {1,2,3,0,0,0};
		int[] b= {2,5,6};
		array.merge(a, 3, b, 3);
	}

}
