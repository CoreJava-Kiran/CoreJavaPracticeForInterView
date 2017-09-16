package com.thread.name.and.current.time.printing;

public class BCP {

	public static void main(String[] args) {

		System.out.println("cuurent Time in milliseconds = " + System.currentTimeMillis());
		System.out.println("Thread name = " + Thread.currentThread().getName());
	}

}
