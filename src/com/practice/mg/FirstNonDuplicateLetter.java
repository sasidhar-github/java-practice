package com.practice.mg;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonDuplicateLetter {

	public static void main(String[] args) {
		String str = "hehlessl";
		Map<Character, Integer> map = new LinkedHashMap<>();
		char  ch = '\u0000';
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				ch = entry.getKey();
				break;
			}
		}
		System.out.println(ch);
	}
}
