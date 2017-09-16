package com.thread.old.way.by.extending.thread.clazz.and.runnable.intarface;

import java.util.concurrent.TimeUnit;

public class FirstWay {

	public static void main(String[] args) {
		System.out.println("Main started");

		Kiran1 k1 = new Kiran1();

		Kiran1 k2 = new Kiran1();

		System.out.println("Main ended");
	}
}

class Kiran1 extends Thread {

	private int id;
	private static int count = 0;

	public Kiran1() {
		this.id = ++count;
		this.start();
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
