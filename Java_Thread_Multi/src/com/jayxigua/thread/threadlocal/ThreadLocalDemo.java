package com.jayxigua.thread.threadlocal;

public class ThreadLocalDemo {

	private ThreadLocal<Boolean> isCantonese = new ThreadLocal<Boolean>();
//	private ThreadLocal<String> isCantonese = new ThreadLocal<String>();

	public void set() {
		try {
			Thread.sleep(System.currentTimeMillis() % 100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String value = "" + System.currentTimeMillis();
		System.out.println("set " + value);
//		isCantonese.set(value);
	}

	public void get() {
		try {
			Thread.sleep(System.currentTimeMillis() % 10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("get " + isCantonese.get());
	}

	public static void main(String[] args) {
		final ThreadLocalDemo demo = new ThreadLocalDemo();
		// TODO Auto-generated method stub
		for (int i = 0; i < 1; i++) {
			try {
				Thread.sleep(System.currentTimeMillis() % 100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			new Thread(new Runnable() {
				@Override
				public void run() {
					demo.set();
					demo.get();
				}
			}).start();
		}
	}
}
