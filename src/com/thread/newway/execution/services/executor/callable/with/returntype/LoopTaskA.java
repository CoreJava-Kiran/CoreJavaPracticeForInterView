package com.thread.newway.execution.services.executor.callable.with.returntype;

import java.util.Random;
import java.util.concurrent.Callable;

public class LoopTaskA implements Callable<Integer> {
	private int id;
	private static int count = 0;

	public LoopTaskA() {
		this.id = ++count;
	}

	@Override
	public Integer call() throws Exception {

		Random random = new Random();
		
		System.out.println("Task ID = " + id + " Starting");

		for (int i = 1; i <= 10; i++) {
			System.out.println("<" + id + ">" + " i  = " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Task ID = " + id + " Ending");

		return random.nextInt();
	}

}
