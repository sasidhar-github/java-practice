package com.test.java8.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class SynchIssue {
    int counter = 0;
	public static void main(String[] args) {
		 SynchIssue issue = new SynchIssue();
		 ExecutorService es = Executors.newFixedThreadPool(2);
		 IntStream.range(0, 1000).forEach(i->es.submit(()->issue.incrementSynch()));
		 es.shutdownNow();
		 System.out.println(issue.counter);
	}
	
	public int increment() {
		return counter = counter+1;
	}
	
	public synchronized int incrementSynch() {
		return counter = counter+1;
	}

}
