package com.nit.beans;

public class ChildClass {
	
	 private String message1;
	 private String message2;
	 
	 private String message3; //Inheritated and will overridden from Parent
	 
	 
	 public void message() {
		 System.out.println("Child : "+message1);
		 System.out.println("Child : "+message2);
		 System.out.println("Child : "+message3);
	 }
	 
	 
	public String getMessage1() {
		return message1;
	}
	public void setMessage1(String message1) {
		this.message1 = message1;
	}
	public String getMessage2() {
		return message2;
	}
	public void setMessage2(String message2) {
		this.message2 = message2;
	}
	public String getMessage3() {
		return message3;
	}
	public void setMessage3(String message3) {
		this.message3 = message3;
	} 
	 
}

