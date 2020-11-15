package com.nit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.beans.MobilePhone;

public class Test {
public static void main(String []args)
{
	ApplicationContext ctx= new ClassPathXmlApplicationContext("com/nit/cfgs/applicationContext.xml");
	
	MobilePhone mobile=(MobilePhone)ctx.getBean("mobile"); 
	
	mobile.audioPlayer();
	mobile.bluetooth();
	mobile.videoPlayer();
	mobile.charging();	
	
}
	
	
}
