package com.bcp;

public class BCP {
	public static void main(String[] args) {
		System.out.println("test");

		int[] marks = { 21, 43, 12, 3 };

		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		for (int i : marks) {
			System.out.println(marks[i]);
		}

	}
}
