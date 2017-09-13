package com.arraylist.sorting.example.using.compartor.of.custom.object;

import java.util.ArrayList;
import java.util.Collections;

public class Bcp {

	public static void main(String[] args) {
		System.out.println("main");
		
		ArrayList<Business> busList = new ArrayList<Business>();
		
		Business b1 = new Business(2,"bengali","234567893");
		Business b2 = new Business(1,"sample","123456789");
		Business b3 = new Business(3,"zebra","333456789");
		Business b4 = new Business(4,"tanger","423456789");
		
		busList.add(b1);
		busList.add(b2);
		busList.add(b3);
		busList.add(b4);
		
		for (Business business : busList) {
			System.out.println(business);
		}
		
		System.out.println("\n sorted by bus ID \n");
		
		Collections.sort(busList, Business.CompartorByBusId);
		
		for (Business business : busList) {
			System.out.println(business);
		}
		
		System.out.println("\n sorted by bus Name \n");
		
		Collections.sort(busList, Business.CompartorByBusName);
		
		for (Business business : busList) {
			System.out.println(business);
		}
		
	}

}
