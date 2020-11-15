package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.nit.beans.GoodMorning;
import com.nit.beans.GoodNight;
import com.nit.cfgs.AppConfig;

public class TEST {
	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		GoodMorning gm=null;
		GoodNight gn=null;
		
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
	    gm=ctx.getBean("goodMorning",GoodMorning.class);
		gn=ctx.getBean("goodNight",GoodNight.class);
		
		gm.message();
		
		gn.message();
	    
		((AbstractApplicationContext) ctx).close();
		
		
		
		
	}

}
