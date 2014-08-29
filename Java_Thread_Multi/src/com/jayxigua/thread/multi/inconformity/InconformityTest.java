package com.jayxigua.thread.multi.inconformity;

import java.util.Random;

public class InconformityTest {
	public static void main(String[] args) {
		InconformityRun run = new InconformityRun();
		new Thread(run).start();
		new Thread(run).start();
		new Thread(run).start();
		new Thread(run).start();
		new Thread(run).start();
	}
}

class InconformityRun implements Runnable {

	int total = 100;

	@Override
	public void run() {
		int count = 0;
		String name = Thread.currentThread().getName();
		while (total >= 0) {
			int x = new Random(System.currentTimeMillis()).nextInt(10);
			count++;
			System.out.println(name + " get total , total = " + total);
//			try {
//				Thread.sleep(x);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			total = total - x;
			System.out.println(name + " update total , minus x =" + x + ", total = " + (total) + " ,count = " + count);
		}
	}
}
