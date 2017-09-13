package com.compare.two.java.objects;

public class BCP {

	public static void main(String[] args) {
		System.out.println("in main()");

		Business b1 = new Business("paint shop", 1, "123456789");
		Business b2 = new Business("paint shop", 1, "123456789");

		if (b1.equals(b2)) {
			System.out.println("b1 and b2 have similar property values");
		} else {
			System.out.println("b1 and b2 not similar");
		}

	}

}
