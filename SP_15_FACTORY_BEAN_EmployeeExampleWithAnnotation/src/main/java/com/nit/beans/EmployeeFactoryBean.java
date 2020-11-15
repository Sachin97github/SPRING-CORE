package com.nit.beans;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("com/nit/commons/info.properties")
public class EmployeeFactoryBean implements FactoryBean <Employee>{
	
	@Autowired
	private Employee employee;
	@Value("${emp.desig}")
	private String designation;
	

	public Employee getObject() throws Exception {
		 System.out.println("EmployeeFactoryBean.getObject()");
		return employee;
	}

	public Class<?> getObjectType() {
		System.out.println("EmployeeFactoryBean.getObjectType()");
		return Employee.class;
	}

	
	public void show()
	{
		System.out.println(employee);
		System.out.println(designation);
	}
	 
	
	
	
	
	
	
	
	
	
	

}
