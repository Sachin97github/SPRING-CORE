package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.Vehicle;

public class Test {

	public static void main(String [] args)
	{
		BeanFactory factory=null;
		Vehicle vehicle=null;
		
		
		factory=new XmlBeanFactory(new FileSystemResource("src/main/resources/applicationContext.xml"));
		
		
		vehicle=(Vehicle) factory.getBean("vehicle");
		
		vehicle.journey("BPL", "HYD");
		
	}
	
}
