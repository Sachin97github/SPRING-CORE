package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.DateRemainder;

public class FactoryBeanTest {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		DateRemainder dt=null;
		
		ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		
		//dt=ctx.getBean("remainder",DateRemainder.class);
		
		//dt.sechduleRemainder();
		
		//TO see Which object factoryBean Will return
		
		
		Object obj=ctx.getBean("dfb");
		
		System.out.println(obj.getClass());
		
		
		
		((AbstractApplicationContext) ctx).close();
		
		
		
	}
}
