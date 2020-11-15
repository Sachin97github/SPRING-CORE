package com.nit.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WebContainer implements ApplicationContextAware {

	private String beanId;
	private ApplicationContext ctx;

	public WebContainer(String beanId) {
		System.out.println("WebContainer 1 Param Constructer");
		this.beanId = beanId;

	}

	public void processRequest(String data) {
		RequestHandler rh = null;

		rh = (RequestHandler) ctx.getBean(beanId, RequestHandler.class);

		System.out.println("WebContainer have request having " + data + " for  processing" + "-->" + this.hashCode());
		rh.handle(data);
	}

	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx = ctx;

	}

}
