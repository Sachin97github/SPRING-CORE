package com.nit.beans;

import org.springframework.stereotype.Component;


@Component("hello")
public class Hello {


	public void init() {
		System.out.println(" Hello.init() ");
	}

	public void message(String data) {
		System.out.println("Hello " + data);
	}

	public void destroy() {
		System.out.println("Hello.destroy()");
	}

}
