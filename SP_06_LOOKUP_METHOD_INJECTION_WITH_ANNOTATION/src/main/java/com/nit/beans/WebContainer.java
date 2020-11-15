package com.nit.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class WebContainer {

	public abstract RequestHandler getRequestHandler();

	public WebContainer() {
		System.out.println("WebContainer 0 Param Constructer");
	}

	public void processRequest(String data) {
		RequestHandler rh = null;
		
		rh=getRequestHandler();
		System.out.println("WebContainer have request having " + data + " for  processing" + "-->" + this.hashCode());
		rh.handle(data);
	}
}
