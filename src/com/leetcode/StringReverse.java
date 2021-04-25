package com.leetcode;

public class StringReverse {
	String revStr = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java"; 
        StringReverse obj = new StringReverse(); 
        obj.revStr = obj.reverse(str); 
        System.out.println(obj.revStr);
	}

	private String reverse(String str) {
        { 
        revStr +=str.charAt(str.length()-1); 
		if ((str==null)||(str.length() <= 1)) 
	           System.out.println(str); 
	        else
	            reverse(str.substring(0,str.length()-1)); 
	        } 
		return revStr;
	}

}
