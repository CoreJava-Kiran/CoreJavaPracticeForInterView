package com.thread.newway.execution.services.executor.callable.with.returntype;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UsingCachedThreadPoolWithReturnType {

	public static void main(String[] args) {
		System.out.println("main started");

		//Task will not be in queue, ES will create the as many service as needed by the tasks
		ExecutorService es = Executors.newCachedThreadPool();
		
		Future<Integer> f1 = es.submit(new LoopTaskA());
	
		es.shutdown();
		
		try {
			System.out.println("Returned value from Thread = " + f1.get());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("main ended");
	}

}
