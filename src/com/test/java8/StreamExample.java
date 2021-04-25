package com.test.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();
		for(int i=0; i<100; i++)
			myList.add(i);

		//sequential stream
		Stream<Integer> sequentialStream = myList.stream();

		//parallel stream
		Stream<Integer> parallelStream = myList.parallelStream();

		//using lambda with Stream API, filter example
		Stream<Integer> highNums = parallelStream.filter(p -> p > 10);
		//using lambda in forEach
		highNums.forEach(p -> System.out.println("High Nums parallel="+p));

		Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p < 10);
		highNumsSeq.forEach(p -> System.out.println("High Nums sequential="+p));
		
		
		System.out.println("Sum is "+ myList.stream().filter(i -> i > 90).mapToInt(i -> i).sum());
	}
}
