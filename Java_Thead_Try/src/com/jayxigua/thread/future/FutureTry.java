package com.jayxigua.thread.future;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureTry {
	public static void main(String[] args) {
		String[] words = { "first-first", "second22second22second22", "world22", "thread" };

		ExecutorService pool = Executors.newCachedThreadPool();
		Set<Future<Integer>> set = new HashSet<Future<Integer>>();

		for (String word : words) {
			Callable callable = new testCallable(word);
			Future future = pool.submit(callable);
			set.add(future);
		}
		int sum = 0;
		for (Future future : set) {
			try {
				Integer i = (Integer) future.get();
				sum += i;
				System.out.println("future.get(): " + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}
		System.out.println("数组中所有单词的总长度为：" + sum);
	}

}

class testCallable implements Callable {
	private String word;

	public testCallable(String word) {

		this.word = word;
	}

	@Override
	public Integer call() throws Exception {
		System.out.println(Thread.currentThread().getName() + ": 开始执行" + word);
		try {
			Thread.currentThread().sleep(100 * word.length());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + ": 正在处理");
		System.out.println(Thread.currentThread().getName() + ": " + word + "长度为：" + word.length());
		return Integer.valueOf(word.length());
	}
}