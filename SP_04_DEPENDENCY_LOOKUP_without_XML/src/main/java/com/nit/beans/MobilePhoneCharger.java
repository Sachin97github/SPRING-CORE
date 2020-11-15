package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("charger")
public class MobilePhoneCharger {
	
	
	

	public MobilePhoneCharger() {
		System.out.println("MobilePhoneCharger.MobilePhoneCharger() - 0 param Constructor");
	}

	public void charging()
	{
		System.out.println("MobilePhoneCharger.charging()");
	}
	
	
	
}
