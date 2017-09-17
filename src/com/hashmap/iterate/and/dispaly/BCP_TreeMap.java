package com.hashmap.iterate.and.dispaly;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class BCP_TreeMap {

	public static void main(String[] args) {
		System.out.println("main started \n\n");

		TreeMap<String, String> busDetails = new TreeMap<String, String>();

		busDetails.put("b4", "zebra");
		busDetails.put("b1", "costco");
		busDetails.put("b2", "bjs");
		busDetails.put("b3", "sams");
		
		Set<Map.Entry<String, String>> values = busDetails.entrySet();

		System.out.println("sorted \n");
		
		for (Map.Entry<String, String> entry : values) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}
		
		System.out.println("\n descending order \n");
		
		NavigableMap< String, String> navMap = busDetails.descendingMap();
		
		Set<Map.Entry<String, String>> valuesDesc = navMap.entrySet();
		
		for (Map.Entry<String, String> entry : valuesDesc) {
			System.out.println(entry.getKey() + "  " + entry.getValue());
		}

		System.out.println("\n\nmain ended");
	}

}
