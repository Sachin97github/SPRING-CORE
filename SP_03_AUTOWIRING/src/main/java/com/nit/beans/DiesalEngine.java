package com.nit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("dengine")
public class DiesalEngine implements Engine {

	public void start() {
	  System.out.println("DiesalEngine.start()");
		
	}

	public void stop() {
		System.out.println("DiesalEngine.stop()");
	}

}
