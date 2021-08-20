package com.practice.mg;

public class Polindrom {

	public static void main(String[] args) {

		String str = "tiTtit";
		int num = 1221;

		System.out.println(
				"String is polindrom: " + isPolindromString(str) + " Number is Polindrom:  " + isPolindromNumber(num));

	}

	private static boolean isPolindromNumber(int num) {
		int dummy = num;
		int revNum = 0;
		int reminder = 0;
		while (dummy > 0) {
			reminder = dummy % 10;
			revNum = revNum * 10 + reminder;
			dummy = dummy / 10;
		}
		return num==revNum;
	}

	private static boolean isPolindromString(String str) {
        String newStr = "";
        for(int i=str.length()-1;i>=0;i--) {
        	newStr = newStr + str.charAt(i);
        }
		return str.equalsIgnoreCase(newStr);
	}

}
