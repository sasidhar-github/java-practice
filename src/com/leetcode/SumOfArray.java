package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[] = {10, 3, 6, 9, 2, 4, 15, 23};int n=8,s=21;
        subarraySum(arr, n, s).forEach(i->System.out.println(i));

	}

	private static List<Integer> subarraySum(int[] arr, int n, int s) {
		// TODO Auto-generated method stub
	    Map<Integer,Integer> map = IntStream.range(0, arr.length).boxed().collect(Collectors.toMap(i->arr[i], i->i));
	    List<Integer> list = new ArrayList<Integer>();
	       for(int i=0;i<arr.length;i++){
	           if(map.containsKey(s-arr[i])) {
	        	   list.add(i);
	        	   list.add(map.get(s-arr[i]));
	        	   break;
	           }
	       }
		return list;
	}

}
