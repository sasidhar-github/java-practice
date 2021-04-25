package com.test.java8.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorPractice {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Future<Integer> future = executorService.submit(() -> {
			return 123;
		});
		System.out.println("future done? " + future.isDone());
		 Integer result =future.get();
		 System.out.println("future done? " + future.isDone());
		 System.out.print("result: " + result);

	}

}
