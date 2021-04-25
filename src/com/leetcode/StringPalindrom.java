package com.leetcode;

public class StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isPalindrome(String s) {
		String str = "", revstr = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetterOrDigit(s.charAt(i))) {
				str = str + Character.toLowerCase(s.charAt(i));
			}
		}
//		for (int j = 0; j < str.length(); j++) {
//
//			revstr = str.charAt(j) + revstr;
//
//		}
//		if (revstr.equals(str))
//			return true;
//		else
//			return false;
		StringBuilder b = new StringBuilder(str);
		if (b.reverse().toString().equalsIgnoreCase(str)) {
			return true;
		}

		return false;
	}

}
