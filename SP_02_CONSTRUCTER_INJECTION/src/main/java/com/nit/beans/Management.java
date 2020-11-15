package com.nit.beans;

public class Management {

	private Student student;

	public Management(Student student) {
		super();
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public void studentInfo()

	{
		System.out.println("Management.studentInfo()");
		System.out.println(student);

	}

}
