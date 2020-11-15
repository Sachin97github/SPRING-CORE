package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.CollectionInjection;

public class CollectionInjectionTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		CollectionInjection ci=null;
		
		ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		
		ci=ctx.getBean("collection",CollectionInjection.class);
		
		ci.mapIterator();
		
		ci.setIterator();
		
		ci.listIterator();
		
		((AbstractApplicationContext) ctx).close();
		
	}
	
}
