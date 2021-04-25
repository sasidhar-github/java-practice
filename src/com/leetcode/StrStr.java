package com.leetcode;

public class StrStr {

	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "ll";
		 int val = -1;
	        if(needle.isEmpty() || haystack.equals(needle)){
	            val = 0;
	        }
	         for(int i=0;i<haystack.length()-needle.length()+1;i++){
	                if(haystack.charAt(i)==needle.charAt(0) &&
	                  haystack.substring(i,i+needle.length()).equals(needle)){
	                    val = i;
	                    break;
	                }
	            }
	}
}
