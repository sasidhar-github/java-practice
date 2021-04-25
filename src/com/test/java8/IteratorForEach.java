package com.test.java8;

import java.util.ArrayList;
import java.util.List;

public class IteratorForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<>();
        names.add("Aryabhata");
        names.add("Garuda");	
		names.forEach(a -> System.out.println(a));

	}

}
