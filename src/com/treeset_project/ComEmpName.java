package com.treeset_project;

import java.util.Comparator;

public class ComEmpName implements Comparator<EmployeeId>{

	public int compare(EmployeeId o1, EmployeeId o2) {
		return o1.nm.compareTo(o2.nm);
	}

}
