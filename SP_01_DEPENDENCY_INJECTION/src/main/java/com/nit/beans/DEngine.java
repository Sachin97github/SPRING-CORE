package com.nit.beans;

public class DEngine implements Engine {

	private String type;
	
	
	
	public DEngine(String type) {
		super();
		this.type = type;
	}

	public void start() {
		System.out.println("DEngine.start() "+type);
	}

	public void stop() {
		System.out.println("DEngine.stop()");
		
	}

}
