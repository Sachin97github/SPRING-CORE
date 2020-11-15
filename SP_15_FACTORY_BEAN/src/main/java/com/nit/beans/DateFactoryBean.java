package com.nit.beans;

import java.util.Date;

import org.springframework.beans.factory.FactoryBean;

public class DateFactoryBean implements FactoryBean <Date> {

	private int year;
	private int month;
	private int day;

	public Date getObject() throws Exception {
		System.out.println("DateFactoryBean.getObject()");

		return new Date(year-1900,month-1,day);
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public Class<?> getObjectType() {
		 System.out.println("DateFactoryBean.getObjectType()");
		return Date.class;
	}

}
