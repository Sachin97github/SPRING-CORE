package com.nit.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MobilePhone implements ApplicationContextAware {

	private String beanId;
	private ApplicationContext ctx;
	
	
		
	public MobilePhone() {
		super();
		System.out.println("MobilePhone.MobilePhone() -  0 param Constructer" );
		// TODO Auto-generated constructor stub
	}

	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
            System.out.println("MobilePhone.setApplicationContext()");
            this.ctx=ctx;
	}

	public void videoPlayer()
	{
		System.out.println("MobilePhone.videoPlayer()");
	}
	
	public void audioPlayer()
	{
		System.out.println("MobilePhone.audioPlayer()");
	}
	
	
	public void bluetooth()
	{
		System.out.println("MobilePhone.bluetooth()");
	}
	
	public void charging()
	
	{
		MobilePhoneCharger charger=null;
		
		charger=(MobilePhoneCharger)ctx.getBean(beanId);
		
		charger.charging();		
		
	}
	

	public String getBeanId() {
		return beanId;
	}

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	
	
	
	
}
