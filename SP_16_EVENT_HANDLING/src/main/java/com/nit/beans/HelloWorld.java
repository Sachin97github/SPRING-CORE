package com.nit.beans;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	
	public HelloWorld() {
		System.out.println("HelloWorld.HelloWorld()");
	}

	public void geeting() {
		System.out.println("HelloWorld.geeting()");
		System.out.println("HELLO SPRING");
	}
}
