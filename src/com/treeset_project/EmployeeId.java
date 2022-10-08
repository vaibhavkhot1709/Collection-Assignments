package com.treeset_project;

import java.util.Objects;

public class EmployeeId {

	Integer id;
	String nm;
	String city;
	public EmployeeId(int id, String nm, String city) {
		super();
		this.id = id;
		this.nm = nm;
		this.city = city;
	}
	public EmployeeId() {
		super();
	}
	public String toString() {
		return "Employee [id=" + id + ", nm=" + nm + ", city=" + city + "]";
	}
	public int hashCode() {
		return Objects.hash(city, id, nm);
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeId other = (EmployeeId) obj;
		return Objects.equals(city, other.city) && id == other.id && Objects.equals(nm, other.nm);
	}

}
