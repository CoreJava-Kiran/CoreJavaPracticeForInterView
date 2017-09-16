package com.thread.old.way.by.extending.thread.clazz.and.runnable.intarface;

import java.util.concurrent.TimeUnit;

public class FourthWay {

	public static void main(String[] args) {
		System.out.println("Main started");

		
		//We are creating the thread in main and starting the thread from main intself
		//This is the best way to use in realtime reason is you are controlling it main method
		Kiran4 k1 = new Kiran4();
		new Thread(k1).start();
		
		
		Kiran4 k2 = new Kiran4();
		new Thread(k2).start();

		System.out.println("Main ended");
	}
}

class Kiran4 implements Runnable {

	private int id;
	private static int count = 0;

	public Kiran4() {
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
