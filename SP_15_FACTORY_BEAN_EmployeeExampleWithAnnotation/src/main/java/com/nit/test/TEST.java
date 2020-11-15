package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.Employee;
import com.nit.beans.EmployeeFactoryBean;

public class TEST {

	public static void main(String[] args) {
		
		ApplicationContext ctx=null;
		Employee emp=null;
		
		ctx=new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
		
		emp=ctx.getBean("employeeFactoryBean",Employee.class);
		
		System.out.println(emp);
		
	}
	
	
}
