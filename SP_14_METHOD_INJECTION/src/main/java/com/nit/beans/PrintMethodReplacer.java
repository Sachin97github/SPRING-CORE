package com.nit.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class PrintMethodReplacer implements MethodReplacer {

	public Object reimplement(Object bean,Method method,Object args[]) throws Throwable
	{
		System.out.println("From Replaced Method");
		
		return bean;  //you can return any Object;
		 
	}
}
