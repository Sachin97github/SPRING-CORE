package com.nit.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component("hello")
public class Hello {

	@PostConstruct
	public void init() {
		System.out.println(" Hello.init() ");
	}

	public void message(String data) {
		System.out.println("Hello " + data);
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Hello.destroy()");
	}

}
