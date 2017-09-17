package com.hashmap.iterate.and.dispaly;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BCP {

	public static void main(String[] args) {
		System.out.println("main started");

		HashMap<String, String> busDetails = new HashMap<String, String>();

		busDetails.put("b1", "costco");
		busDetails.put("b2", "bjs");
		busDetails.put("b3", "sams");

		Set<Map.Entry<String, String>> values =   busDetails.entrySet();
		
		for (Map.Entry<String, String> entry : values) {
			System.out.println(entry.getKey()  +  "  " +  entry.getValue());
		}
		
		System.out.println("main ended");
	}

}
