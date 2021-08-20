package com.geekforgeeks.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(112);
		list.add(2);
		list.add(1);
		list.add(412);
		list.add(123);

		Collections.sort(list);
		System.out.println("Lowest " +list.get(0)+"  Highest "+list.get(list.size()-1));
		System.out.println(new ArrayList<>(list.subList(0, list.size()/2)));
		System.out.println(new ArrayList<>(list.subList(list.size()/2,list.size())));
	}

}
