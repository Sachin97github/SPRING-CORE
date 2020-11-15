package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Hello;

public class Test {

	public static void main(String[] args)
	{
	    ApplicationContext ctx=null;
	    Hello obj=null;
		
	    ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		
	    obj=(Hello)ctx.getBean("hello");
	    
	    obj.message("Sachin");
	    
	    ((AbstractApplicationContext) ctx).close();
		
	}
	
}