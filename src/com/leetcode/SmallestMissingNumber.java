package com.leetcode;

public class SmallestMissingNumber {

	public static void main(String[] args) {
		int A[] = { 1,2,3};
        System.out.println(solution(A));

	}

	private static int solution(int[] a) {
		// TODO Auto-generated method stub
		int len = a.length;
		boolean[] bool = new boolean[len+1];
		for(int i=0;i<len;i++) {
			if(a[i]>0&&a[i]<len) {
				bool[a[i]]=true;
			}
		}
		for(int i=1;i<len;i++) {
			if(!bool[i]) {
				return i;
			}
		}
		return len+1;
	}

}
