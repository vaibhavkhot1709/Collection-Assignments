package com.treeset_project;

import java.util.Objects;

public class Student implements Comparable {

	Integer roll;
	String nm;
	String depmt;

	public Student() {
	}

	public Student(int roll, String nm, String dempt) {

		this.roll = roll;
		this.nm = nm;
		this.depmt = depmt;

	}

	public String toString() {
		return "Student [roll = " + roll + ", name = " + nm + ", depmt = " +depmt + "]";

	}

	public int hashCode() {
		return Objects.hash(roll, nm, depmt);
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o instanceof Student) {
			Student s = (Student) o;
			if(this.roll==s.roll && this.nm==s.nm && this.depmt==s.depmt) {
				return true;
			}return false;
		}return false;
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
//		Student s=(Student)o;
//		if(this.roll==s.roll)
//			return 0;
//		if(this.roll >s.roll)
//		return 1;
//		else
//			return -1;
//	}
	
}
