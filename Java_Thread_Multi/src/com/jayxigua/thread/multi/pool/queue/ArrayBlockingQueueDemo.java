package com.jayxigua.thread.multi.pool.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.CallerRunsPolicy;
import java.util.concurrent.TimeUnit;

public class ArrayBlockingQueueDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2, 4, 1L, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2), new CallerRunsPolicy());
		// ThreadPoolExecutor threadPool = new ThreadPoolExecutor(2, 2, 600L,
		// TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2));
		for (int i = 0; i < 10; i++) {
			System.out.println(i + " : threadPool.getQueue().size() " + threadPool.getQueue().size() + "threadPool.getActiveCount() " + threadPool.getActiveCount() + " threadPool.getPoolSize() " + threadPool.getPoolSize());
			threadPool.execute(new ArrayBlockingQueueRunner());
		}
		Thread.sleep(3000);
		threadPool.execute(new ArrayBlockingQueueRunner());
		threadPool.execute(new ArrayBlockingQueueRunner());
		for (int i = 0; i < 100; i++) {
			System.out.println(i + " : threadPool.getQueue().size() " + threadPool.getQueue().size() + "threadPool.getActiveCount() " + threadPool.getActiveCount() + " threadPool.getPoolSize() " + threadPool.getPoolSize());
			Thread.sleep(100);
		}
	}

}

class ArrayBlockingQueueRunner implements Runnable {

	@Override
	public void run() {
		System.out.println(System.currentTimeMillis());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
