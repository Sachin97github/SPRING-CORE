package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.GoodAfternoon;
import com.nit.beans.GoodMorning;
import com.nit.beans.GoodNight;

public class BeanPostProcessorTest {

	public static void main(String[] args)
    {
	   ApplicationContext ctx=null;
	   GoodMorning gm=null;
	   GoodAfternoon af=null;
	   GoodNight gn=null;
	   
	   
	   ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		
	   gm=(GoodMorning) ctx.getBean("goodMorning");
	   af=(GoodAfternoon) ctx.getBean("goodAfternoon");
	   gn=(GoodNight) ctx.getBean("goodNight");
	   
	   gm.message();
	   af.message();
	   gn.message();
		
	}
}
