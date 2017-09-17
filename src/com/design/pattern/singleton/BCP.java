package com.design.pattern.singleton;

public class BCP {

	public static void main(String[] args) {
		System.out.println("main started");

		BCPUtil a = BCPUtil.getInstance();
		System.out.println("object created = " + a.hashCode());

		BCPUtil b = BCPUtil.getInstance();
		System.out.println("object created = " + b.hashCode());

		if (a.equals(b)) {
			System.out.println("both are same");
		} else {
			System.out.println("not equal");
		}

		System.out.println("main ended");
	}

}
