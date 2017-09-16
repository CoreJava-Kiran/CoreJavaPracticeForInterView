package com.thread.old.way.by.extending.thread.clazz.and.runnable.intarface;

import java.util.concurrent.TimeUnit;

public class SecondWay {

	public static void main(String[] args) {
		System.out.println("Main started");

		Kiran2 k1 = new Kiran2();
		k1.start();

		Kiran2 k2 = new Kiran2();
		k2.start();

		System.out.println("Main ended");
	}
}

class Kiran2 extends Thread {

	private int id;
	private static int count = 0;

	public Kiran2() {
		// we are NOT starting the thread in the constructor
		// this.start();
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
