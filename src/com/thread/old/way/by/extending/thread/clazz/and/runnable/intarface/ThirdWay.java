package com.thread.old.way.by.extending.thread.clazz.and.runnable.intarface;

import java.util.concurrent.TimeUnit;

public class ThirdWay {

	public static void main(String[] args) {
		System.out.println("Main started");

		new Kiran3();
		new Kiran3();

		System.out.println("Main ended");
	}
}

class Kiran3 implements Runnable {

	private int id;
	private static int count = 0;

	public Kiran3() {
		this.id = ++count;
		// we are starting the thread in the constructor by passing this to Thread class and start
		new Thread(this).start();
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
