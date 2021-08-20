package com.practice.mg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramsList {

	public static void main(String[] args) {
		AnagramsList anagramsList = new AnagramsList();
		String[] str = { "act", "god", "cat", "dog", "tac" };
		anagramsList.printAnagramsTogether(str);
	}

	private void printAnagramsTogether(String[] str) {
		Map<String, List<String>> map = new HashMap<>();
		List<String> ls = new ArrayList<>();
		for (String s : str) {
			String ss = Arrays.stream(s.split("")).sorted().reduce(String::concat).get();
			if (map.containsKey(ss)) {
				map.get(ss).add(s);
			} else {
				ls = new ArrayList<String>();
				ls.add(s);
				map.put(ss, ls);
			}
		}
		System.out.println(map.values());
	}

}
