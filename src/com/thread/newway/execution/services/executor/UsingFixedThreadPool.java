package com.thread.newway.execution.services.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingFixedThreadPool {

	public static void main(String[] args) {
		System.out.println("main started");

		//Tasks will be in queue. only 3 Threads you need to use those 3 only
		ExecutorService es = Executors.newFixedThreadPool(3);
		
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
