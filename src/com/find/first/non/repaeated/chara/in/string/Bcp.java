package com.find.first.non.repaeated.chara.in.string;

public class Bcp {
	public static void main(String[] args) {
		System.out.println("in main()");

		String input = "teeter";

		for (char i : input.toCharArray()) {
			if (input.indexOf(i) == input.lastIndexOf(i)) {
				System.out.println("Find the First non repeated character in a given string====" + i);
				break;
			}
		}
	}
}