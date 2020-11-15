package com.nit.beans;

public class Student {
	
	private double enrollment;
	private String name;
	private String address;
	
	
	public Student(double enrollment, String name, String address) {
		super();
		this.enrollment = enrollment;
		this.name = name;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [enrollment=" + enrollment + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	

}
