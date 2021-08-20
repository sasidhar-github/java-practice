package com.practice.interview;

import java.util.Arrays;

public class SwapEasily {

	public static void main(String[] args) {
		int[] arr = {2,5,69,54,87,26,4};
		int i =0,k=arr.length-1;
		while(i<k) {
			int a = arr[i];
			arr[i] = arr[k];
			arr[k] = a;
			i++;
			k--;
		}
       System.out.println(Arrays.toString(arr));
       System.out.println(" Using Java8 streams ===> ");
       Arrays.stream(arr).forEach(System.out::println);
	}

}
