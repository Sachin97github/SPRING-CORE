package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("com/nit/commons/info.properties")
public class Employee {

	@Value("${emp.name}")
	private String name;
	@Value("${emp.id}")
	private int id;
	@Value("${emp.address}")
	private String address;
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
	}	
	
	
}
