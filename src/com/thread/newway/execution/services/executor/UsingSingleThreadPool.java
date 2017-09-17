package com.thread.newway.execution.services.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingSingleThreadPool {

	public static void main(String[] args) {
		System.out.println("main started");

		//Only one Thread - this is one by one`- sequential execution
		ExecutorService es = Executors.newSingleThreadExecutor();
		
		LoopTaskA l1 = new LoopTaskA();
		LoopTaskA l2 = new LoopTaskA();
		LoopTaskA l3 = new LoopTaskA();
		LoopTaskA l4 = new LoopTaskA();
		LoopTaskA l5 = new LoopTaskA();
		LoopTaskA l6 = new LoopTaskA();
		
		es.execute(l1);
		es.execute(l2);
		es.execute(l3);
		
		es.execute(l4);
		es.execute(l5);
		es.execute(l6);
		
		es.shutdown();

		System.out.println("main ended");
	}

}
