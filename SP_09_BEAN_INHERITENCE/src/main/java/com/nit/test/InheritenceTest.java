package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.ChildClass;
import com.nit.beans.ParentClass;

public class InheritenceTest {
	
	public static void main(String[] args)
	{
		ApplicationContext ctx=null;
		ChildClass child=null;
		ParentClass parent=null;
		
		ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		
		parent=(ParentClass)ctx.getBean("parent");
		child=(ChildClass)ctx.getBean("child");
	 
		parent.message();
		child.message();
		
		
	}

}
