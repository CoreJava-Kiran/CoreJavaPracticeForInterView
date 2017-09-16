package com.thread.newway.executor.services;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingCachedThreadPool {

	public static void main(String[] args) {
		System.out.println("main started");

		//Task will not be in queue, ES will create the as many service as needed by the tasks
		ExecutorService es = Executors.newCachedThreadPool();
		
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
