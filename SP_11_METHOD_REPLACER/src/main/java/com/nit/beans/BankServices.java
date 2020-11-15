package com.nit.beans;

public class BankServices {

	public BankServices() {
		System.out.println("BankServices 0 param Constructor");
	}
	
	
	public float calcIntrestAmount(float pAmnt,float time)
	{
		System.out.println("BankServices.calcIntrestAmount() ----> Original");
	
		return (pAmnt*time*1.0f)/100.0f;	
	}
	
	
	
	
	

}
