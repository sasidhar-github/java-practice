package com.practice.interview;

import java.util.Arrays;
import java.util.Collections;

public class MainArraySort {

	public static void main(String[] args) {
		String[] str = {"abc", "11","3","tr","0","22"};
		Collections.sort(Arrays.asList(str));
		System.out.println(Arrays.toString(str));
	}
}
