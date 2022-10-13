package com.treeset_project;

import java.util.Objects;

public class Student implements Comparable {

	Integer roll;
	String nm;
	String depmt;

	public Student() {
		super();
	}

	public Student(int roll, String nm, String depmt) {
		this.roll = roll;
		this.nm = nm;
		this.depmt = depmt;
	}

	public int hashCode() {
		return Objects.hash(roll, nm, depmt);
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", nm=" + nm + ", depmt=" + depmt + "]";
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o instanceof Student) {
			Student s = (Student) o;
			if (this.roll == s.roll && nm.equals(s.nm) && nm.equals(s.nm)){
				return true;
			}
			return false;
		}
		return false;
	}

//	>>>>>>>>>>>>>>>>>>>sorting by roll number >>>>>>>>>>>>>>>
//	public int compareTo(Object o) { 
//		Student s=(Student)o;
//		if(this.roll==s.roll)
//			return 0;
//		if(this.roll >s.roll)
//		return 1;
//		else
//			return -1;
//	}

//	>>>>>>>>>>>>>>>>>>>sorting by name number >>>>>>>>>>>>>>>

	public int compareTo(Object o) {
		Student s=(Student)o;
		if(this.nm==s.nm)
			return 0;
		if(this.nm.compareTo(s.nm)>0)
		return 1;
		else
			return -1;
	}

//	>>>>>>>>>>>>>>>>>>>sorting by Department number >>>>>>>>>>>>>>>

//	public int compareTo(Object o) {
//		Student s = (Student) o;
//		if (this.depmt == s.depmt)
//			return 0;
//		if (this.depmt.compareTo(s.depmt) > 0)
//			return 1;
//		else
//			return -1;
//	}

}
