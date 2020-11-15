package com.nit.beans;

public class Greetings {

     private GoodMorning gm;
     
	public Greetings() {
	      System.out.println("Greetings.Greetings()");
	}
	
	public Greetings(GoodMorning gm) {
		super();
		this.gm = gm;
	}
	
	public void greetingMsg() {
		System.out.println("Greetings.greetingMsg()");
		gm.message();
	}
     
	
}
