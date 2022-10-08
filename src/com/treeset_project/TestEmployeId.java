package com.treeset_project;

import java.util.TreeSet;

public class TestEmployeId {
	public static void main(String[] args) {
		EmployeeId e1=new EmployeeId(33,"ram","pune");
		EmployeeId e2=new EmployeeId(67,"sham","mumbai");
		EmployeeId e3=new EmployeeId(21,"vijay","kolhapur");
		EmployeeId e4=new EmployeeId(45,"murli","sangali");
		
//		TreeSet t =new TreeSet(new CompEmpId());

//		TreeSet t =new TreeSet(new ComEmpName());
		
		TreeSet t =new TreeSet(new ComEmpCity());
		
		t.add(e4);
		t.add(e1);
		t.add(e2);
		t.add(e3);
		System.out.println(t);
		
		
	}

}
