package com.thread.newway.executor.services;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingSingleThreadPool {

	public static void main(String[] args) {
		System.out.println("main started");

		//Only one Thread - this is one by one`- sequential execution
		ExecutorService es = Executors.newSingleThreadExecutor();
		
		es.execute(new LoopTaskA());
		es.execute(new LoopTaskA());
		es.execute(new LoopTaskA());
		
		es.execute(new LoopTaskA());
		es.execute(new LoopTaskA());
		es.execute(new LoopTaskA());
		
		es.shutdown();

		System.out.println("main ended");
	}

}
