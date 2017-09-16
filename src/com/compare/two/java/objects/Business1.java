package com.compare.two.java.objects;

public class Business1 {

	private String busName;

	private int busId;

	private String busEin;

	public Business1() {
		super();
	}

	public Business1(String busName, int busId, String busEin) {
		this.busName = busName;
		this.busId = busId;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((busEin == null) ? 0 : busEin.hashCode());
		result = prime * result + busId;
		result = prime * result + ((busName == null) ? 0 : busName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Business1 other = (Business1) obj;
		if (busEin == null) {
			if (other.busEin != null)
				return false;
		} else if (!busEin.equals(other.busEin))
			return false;
		if (busId != other.busId)
			return false;
		if (busName == null) {
			if (other.busName != null)
				return false;
		} else if (!busName.equals(other.busName))
			return false;
		return true;
	}

}
