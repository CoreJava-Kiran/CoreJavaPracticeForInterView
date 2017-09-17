package com.design.pattern.factory;

public class BCP {

	public static void main(String[] args) {
		System.out.println("main started");

		OSFactory factory = new OSFactory();
		
		OS o1 = factory.getInstance("Android");
		o1.printSpecification();
		
		OS o2 = factory.getInstance("IOS");
		o2.printSpecification();
		
		System.out.println("main ended");
	}

}
