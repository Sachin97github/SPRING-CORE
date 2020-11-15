package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.PrintMsgClass;

public class TEST {

	public static void main(String[] args) {

		ApplicationContext ctx = null;
		PrintMsgClass pm = null;

		ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		
		
		
		pm = ctx.getBean("printclass", PrintMsgClass.class);

		pm.print();
	}

}
