package com.test.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8Comparator {
	
	public static void main(String[] a) {
		List<String> list = Arrays.asList(new String[] {"hello","hai"});
		
		Collections.sort(list,new Comparator<String>() {
            @Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		
		});
	}


	
}
