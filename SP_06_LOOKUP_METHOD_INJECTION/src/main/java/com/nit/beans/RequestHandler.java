package com.nit.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("handler")
@Scope("prototype")
public class RequestHandler {
	
	private static int count;

	public RequestHandler() {
		 count++;
		System.out.println(" RequestHandler O Param Constructer" +count);
	}
	
	public void handle(String data)
	{
		
		System.out.println("Request Handled by Object "+count+" "+data +"-->"+this.hashCode());
		
	}
	
	
	

}
