package com.leetcode;

public class DuplicateZerosInArray {

    public void duplicatezeros(int[] arr) {
        for(int i=0;i<arr.length;){
            if(arr[i] == 0){
                for(int j=arr.length-1;j>i;j--){
                     arr[j] = arr[j-1];                                      
                }
                if(i+1<arr.length){
                    arr[i+1] = arr[i];
                }
             i+=2;
            } else {
                i+=1;
            }
        }
    }
	public static void main(String[] args) {
		DuplicateZerosInArray array= new DuplicateZerosInArray();
		int[] a= new int[1];
		a[0]=1;
		System.out.println(a);
	}

}
