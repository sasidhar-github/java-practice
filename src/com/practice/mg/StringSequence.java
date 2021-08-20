package com.practice.mg;

import java.util.ArrayList;
import java.util.List;

public class StringSequence {

	public static void main(String[] args) {
		String str = "abcde";
		List<String> ls = new ArrayList<>();
		int pos = 3;
		for (int i = 0; i < str.length(); i++) {
			if (pos <= str.length()) {
				ls.add(str.substring(i, pos));
				pos = pos + 1;
			}
		}
		System.out.println(ls);
	}

}
