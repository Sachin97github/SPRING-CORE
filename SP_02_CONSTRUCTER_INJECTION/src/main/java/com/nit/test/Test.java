package com.nit.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nit.beans.Management;

public class Test {
	
	
	public static void main(String[] args)
	{
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/main/resources/applicationContext.xml"));
		
		Management management=(Management) factory.getBean("management");
		
		
		management.studentInfo();
		
		
		}

}
