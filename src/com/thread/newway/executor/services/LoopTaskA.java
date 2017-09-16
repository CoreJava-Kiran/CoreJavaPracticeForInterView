package com.thread.newway.executor.services;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable {
	private int id;
	private static int count = 0;

	@Override
	public void run() {

		System.out.println("Task ID = " + id + " Starting");

		for (int i = 1; i <= 10; i++) {
			System.out.println("<" + id + ">" + " i  = " + i);
			try {
				TimeUnit.MICROSECONDS.sleep((long) Math.random() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Task ID = " + id + " Ending");

	}

	public LoopTaskA() {
		this.id = ++count;
	}

}
