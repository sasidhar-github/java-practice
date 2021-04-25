package com.leetcode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		LongestCommonPrefix pf = new LongestCommonPrefix();
		System.out.println(pf.longestCommonPrefix(new String[]{"flower","flo","flowight"}));
	}
	public String longestCommonPrefix(String[] strs) {
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			prefix = commonPrefix(prefix,strs[i]);
		}
		return prefix;
	}

	String commonPrefix(String a,String b) {
        String result = "";
		for (int i = 0, j = 0; i < a.length() && j < b.length(); i++, j++) {
			if (a.charAt(i) != b.charAt(j)) {
				break;
			}
			result += a.charAt(i);
		}
		return result;
	}
}
