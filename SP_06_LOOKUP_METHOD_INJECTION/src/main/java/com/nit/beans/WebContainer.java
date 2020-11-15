package com.nit.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("container")
public abstract class WebContainer {

	@Lookup(value="handler" )   //value is optional
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
