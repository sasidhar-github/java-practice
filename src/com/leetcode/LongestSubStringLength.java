package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringLength {

	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(new LongestSubStringLength().lengthOfLSB(s));
	}

	private int lengthOfLSB(String s) {

		int n = s.length();
		int ans = 0;

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0, j = 0; j < n; j++) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)), i);
			}
			ans = Math.max(ans, j - i + 1);
			map.put(s.charAt(j), j + 1);
		}
		return ans;
	}

}
