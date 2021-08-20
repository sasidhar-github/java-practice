package com.practice.mg;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class NumberOfAlerts {

	public static void main(String[] args) {
		int preecedingMin = 3;
		int alertThreshold = 4;
		int[] calls = {2,2,2,5,5,5,8};
		System.out.println(numberOfAlrts(preecedingMin,alertThreshold,calls));

	}

	private static long numberOfAlrts(int preecedingMin, int alertThreshold, int[] calls) {
		int l = calls.length;
		List<Double> ls = new ArrayList<>();
		for(int i=0;i<l;i++) {
			if(preecedingMin <= calls.length) {
				ls.add(IntStream.range(i, preecedingMin).map(k->calls[k]).average().getAsDouble());
				preecedingMin++;
			}
		}
		return ls.stream().filter(i->i>alertThreshold).count();
	}

}
