package com.leetcode;

import java.util.Arrays;

public class StringToInteger {

	public static void main(String[] args) {
		String s = "-91283472332 ";
		  s = s.trim();
	        int end = 0;
            boolean isNegative = false;
	        for(int i=0;i<s.length();i++){
	            if(s.charAt(0)=='-') isNegative = true;
	            if(isNegative || Character.isDigit(s.charAt(i))){
	                end = i;
	            }else{
	                break;
	            }
	        }
	        s = isNegative?s.substring(1,end+1):s.substring(0,end+1);
	        int val = s.length()>0 && end > 0?Integer.parseInt(s):0;
	        System.out.println(val);
	}
	
}
