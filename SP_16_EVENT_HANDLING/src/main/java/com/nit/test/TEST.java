package com.nit.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.HelloWorld;

public class TEST {

	public static void main(String[] args) {
 
		ConfigurableApplicationContext cctx=null;
		HelloWorld helloWorld=null;
		
		cctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		
		cctx.start(); //You can Call it Anywhere
		
		helloWorld=cctx.getBean("helloWorld",HelloWorld.class);
	    helloWorld.geeting();
		
		cctx.stop();  //it Does not stops the ApplicationContext 
		              //It just a Event that is Overridden
	}
}
