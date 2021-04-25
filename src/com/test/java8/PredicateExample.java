package com.test.java8;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> greaterThanTen = i->i>10;
		System.out.println(greaterThanTen.test(11));
		System.out.println(greaterThanTen.test(8));
		
		Predicate<Integer> lessThanTwentySix = i->i<26;
		System.out.println(greaterThanTen.and(lessThanTwentySix).test(16));
		System.out.println(greaterThanTen.and(lessThanTwentySix).test(31));
		System.out.println(greaterThanTen.or(lessThanTwentySix).test(16));
		System.out.println(greaterThanTen.or(lessThanTwentySix).negate().test(16));
		
	}

}
