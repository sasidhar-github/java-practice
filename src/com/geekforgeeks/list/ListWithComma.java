package com.geekforgeeks.list;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListWithComma {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Hi", "There", "Comma");
		System.out.println(String.join(",", list));
		LinkedList<String> linkedList = new LinkedList<String>();

		// Adding elements to the linked list
		// By default elements are inserted at
		// the last.
		linkedList.add("e");
		linkedList.add("r");
		linkedList.add("g");
		System.out.println("Linked list: " + linkedList);
		linkedList.addFirst("F");
		linkedList.addLast("L");
		System.out.println("Linked list: " + linkedList);

	}

}
