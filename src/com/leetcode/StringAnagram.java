package com.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringAnagram {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "aangram";
        boolean isAnag = false;
        if(s.length() != t.length()){
        	isAnag= false;
        }
        char[] char1 = s.toLowerCase().toCharArray();
        char[] char2 = t.toLowerCase().toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        if(Arrays.equals(char1,char2)){
            isAnag = true;
        } 
        System.out.println(isAnag);
	}
	
}
