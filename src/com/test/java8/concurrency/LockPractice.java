package com.test.java8.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.IntStream;

public class LockPractice {
    int counter = 0;
    ReentrantLock lock = new ReentrantLock();
	public static void main(String[] args) {
		 LockPractice issue = new LockPractice();
		 issue.submitExec(issue);
	}

	private void submitExec(LockPractice issue) {
		ExecutorService es = Executors.newFixedThreadPool(1);
		 IntStream.range(0, 1000).forEach(i->es.submit(this::increment));
		 es.shutdownNow();
		 System.out.println(issue.counter);
	}
	
	public void increment() {
		lock.lock();
		try {
			counter++;
		}finally {
			lock.unlock();
		}		
	}
	
	public void incrementReadWrite() throws InterruptedException {
		ReadWriteLock lock = new ReentrantReadWriteLock();
		lock.readLock().lock();
		lock.writeLock().lock();
		
		Semaphore semaphore = new Semaphore(5);
		//This permits only the concurrency of 5
		if(semaphore.tryAcquire()) {
			
		}
		try {
			counter++;
		}finally {
			semaphore.release();
		}	
	}

}
