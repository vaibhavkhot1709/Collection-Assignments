package com.treeset_project;
import java.util.*;
public class CompEmpId implements Comparator<EmployeeId> {
	
	public int compare(EmployeeId e1, EmployeeId e2) {
		
		return e1.id.compareTo(e2.id);
	}

}