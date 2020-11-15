package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nit.beans.Greetings;
import com.nit.cfgs.AppConfig;

public class TEST {
	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		Greetings greet=null;
		
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		greet=ctx.getBean("greetings",Greetings.class);
		
		greet.greetingMsg();
		
		
		((AbstractApplicationContext) ctx).close();
		
		
		
		
	}

}
