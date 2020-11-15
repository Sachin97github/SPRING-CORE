package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.BeanA;

public class TEST {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		BeanA beanA=null;
		
		ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		
		beanA=ctx.getBean("beanA",BeanA.class);
	}
}
