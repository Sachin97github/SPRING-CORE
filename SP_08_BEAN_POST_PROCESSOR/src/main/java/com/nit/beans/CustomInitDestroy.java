package com.nit.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomInitDestroy implements BeanPostProcessor{
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("Brfore Initialization : "+beanName);
		
		return bean;
	}
	

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
	
		System.out.println("After Initialization "+beanName);
		
		return bean; //can Return any Object
	}
	
	

}
