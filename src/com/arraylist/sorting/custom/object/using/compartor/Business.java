package com.arraylist.sorting.custom.object.using.compartor;

import java.util.Comparator;

public class Business {
	
	private int busId;

	private String busName;

	private String busEin;

	public Business() {
		super();
	}

	public Business(int busId, String busName, String busEin) {
		this.busId = busId;
		this.busName = busName;
		this.busEin = busEin;
	}

	public String getBusName() {
		return busName;
	}

	public void setBusName(String busName) {
		this.busName = busName;
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public String getBusEin() {
		return busEin;
	}

	public void setBusEin(String busEin) {
		this.busEin = busEin;
	}

	public static Comparator<Business> CompartorByBusId = new Comparator<Business>() {

		@Override
		public int compare(Business o1, Business o2) {
			int busId1 = o1.getBusId();
			int busId2 = o2.getBusId();
			/* For ascending order */
			return busId1 - busId2;

			/* For descending order */
			// return busId2-busId1;
		}
	};
	

	public static Comparator<Business> CompartorByBusName = new Comparator<Business>() {

		@Override
		public int compare(Business s1, Business s2) {
			   String busName1 = s1.getBusName().toUpperCase();
			   String busName2 = s2.getBusName().toUpperCase();

			   //ascending order
			   return busName1.compareTo(busName2);

			   //descending order
			   //return busName2.compareTo(busName1);
		}


	};

	@Override
	public String toString() {
		return "Business [busId=" + busId + ", busName=" + busName + ", busEin=" + busEin + "]";
	}

}
