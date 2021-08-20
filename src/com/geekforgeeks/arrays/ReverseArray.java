package com.geekforgeeks.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {2,4,12,1,43,68,1,57,0,4};
		for(int i=0;i<arr.length/2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
      System.out.println("Sorting using for loop: "+Arrays.toString(arr));
      int[] array = {1,2,3,4,5,6,7,8,9};
      System.out.println("New Array "+Arrays.toString(array));
      Arrays.sort(Arrays.stream(array).boxed().toArray(Integer[]::new),Collections.reverseOrder());
      System.out.println(Arrays.toString(array));
	
	}

}
