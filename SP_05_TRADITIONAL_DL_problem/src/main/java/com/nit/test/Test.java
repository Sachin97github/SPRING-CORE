package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.WebContainer;

public class Test {
	
  public static void main(String [] args)
  {
	  ApplicationContext ctx=null;
	  WebContainer container=null;
	  
	  
	  ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
	  
	  container=(WebContainer) ctx.getBean("container",WebContainer.class);
	  
	  container.processRequest("Corona");
	  
	  System.out.println("------------------------------");
	  
	  container.processRequest("Treatment");

	  System.out.println("------------------------------");
	  
	  container.processRequest("Death");
	  
	  System.out.println("------------------------------");
	  
	  
	  ((AbstractApplicationContext) ctx).close();
	  
  }
}
