package com.arraylist.sorting.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Bcp {

	public static void main(String[] args) {
		System.out.println("test");

		ArrayList<String> nameList = new ArrayList<String>();

		nameList.add("zebra");
		nameList.add("anil");
		nameList.add("kiran");

		System.out.println("nameList= " + nameList);

		System.out.println();

		for (String name : nameList) {
			System.out.println(name);
		}

		Collections.sort(nameList);

		// Sort in descending order using a single command
		// Collections.sort(nameList, Collections.reverseOrder());

		System.out.println("\nafter sort\n");

		for (Iterator<String> iterator = nameList.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);

		}

		System.out.println("\nreverse order \n");

		Collections.reverse(nameList);

		for (String name : nameList) {
			System.out.println(name);
		}

	}
}
