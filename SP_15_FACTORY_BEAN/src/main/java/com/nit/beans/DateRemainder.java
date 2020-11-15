package com.nit.beans;

import java.util.Date;

public class DateRemainder {
	
	private Date date;
	

	public DateRemainder() {
		System.out.println("DateRemainder.DateRemainder() 0 Paraam Constructor");
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public void sechduleRemainder()
	{
		Date sysDate=null;
		
		sysDate=new Date();
		
		System.out.println(sysDate.getMonth()+" "+sysDate.getDay()+" "+sysDate.getYear());
		
		if(sysDate.getDay()==date.getDay()&&sysDate.getMonth()==date.getMonth()&&sysDate.getYear()==date.getYear())
		{
			System.out.println("DateRemainder.sechduleRemainder()");
			System.out.println("YOU HAVE A APPOINTMENT TODAY");
		}
		else
			System.out.println("YOU DONT HAVE ANY APPOINTMENT TODAY..............CHILLEXXxx");
		
		
	}
	
	
	

}
