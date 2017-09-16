package com.thread.old.way.by.extending.thread.clazz.and.runnable.intarface;

import java.util.concurrent.TimeUnit;

public class FifthWay_Inline_Thread_not_recommended_with_capturing_the_reference_also {

	public static void main(String[] args) {
		System.out.println("Main started");

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(" i  = " + i);
					try {
						TimeUnit.MICROSECONDS.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		});

		// we have captured the t1 reference and starting the thread outside
		t1.start();

		System.out.println("Main ended");
	}
}

class Kiran55 implements Runnable {

	private int id;
	private static int count = 0;

	public Kiran55() {
		this.id = ++count;

	}

	@Override
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("<" + id + ">" + " i  = " + i);
			try {
				TimeUnit.MICROSECONDS.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
