package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.BankServices;

public class MethodReplacerTest {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		BankServices service=null;
		
		ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		
		service=ctx.getBean("bankservice",BankServices.class);
		
		System.out.println(service.calcIntrestAmount(12000,2));;
		
		System.out.println("MethodReplacerTest.main() "+service.getClass()+" "+service.getClass().getSuperclass());
				
		//  Subclass (Which have replace method) is created whenever IOC sees Replace Mthod 
		//  in  Subclass Orgingal Method is replaced by reImplement Method
		
	}
	

}
