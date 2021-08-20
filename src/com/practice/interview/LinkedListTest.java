package com.practice.interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList list = new LinkedList<>();
       list.add("Hello");
       list.add(1);
       list.add("23");
       list.add(true);
       list.add("134");
       list.add(Boolean.parseBoolean("fAlse"));
       list.add("6");
       System.out.println(list);
       System.out.println(list.get(0) instanceof Object);
       System.out.println(list.get(1) instanceof Integer);
       List<Boolean> blist = new ArrayList<>();
       blist.add(true);
       blist.add(Boolean.parseBoolean("fAlse"));
       blist.add(Boolean.TRUE);
       System.out.println(blist.size());
       System.out.println(blist.get(1) instanceof Boolean);
	}

}
