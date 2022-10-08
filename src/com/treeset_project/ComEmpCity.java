package com.treeset_project;

import java.util.Comparator;

public class ComEmpCity implements Comparator<EmployeeId> {
	public int compare(EmployeeId o1, EmployeeId o2) {
		return o1.city.compareTo(o2.city);
	}
}
